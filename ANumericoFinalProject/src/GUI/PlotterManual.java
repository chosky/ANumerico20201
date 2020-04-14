package GUI;

import javax.swing.*;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import org.nfunk.jep.*;  
import org.nfunk.jep.type.*;


public class PlotterManual extends JPanel {
    //VARIABLES PARA EL EVALUADOR DE FUNCIONES
    private JEP miEvaluador,miEvaluadorDerivadas;
    Node nodin;
    
    boolean errorEnExpresion; //si hay error de sintaxis en la función
    boolean errorEnNumero   ; //si hay error de sintaxis en la función
    boolean visible=true;
    
    //TIPOS DE FUENTE
    Font ft10 = new Font("Arial",Font.PLAIN,10);
    Font ft12 = new Font("Arial",Font.PLAIN,12);
    Font ft7  = new Font("Arial",Font.PLAIN,10);//funte de los numeros
        
    //CAMPOS DE TEXTO
    JTextField campoFuncion;
   
 //   JTextField campoDerivada;
    
    JLabel Mensaje;
    JLabel etiquetaA;

    JScrollPane scrollPane;
    JList listBusca;
    DefaultListModel listModel;
    
    //BOTONES
    JButton BtnGraficar;
    JButton Btnsalir;

    int puntosInt;
    
    //PANELES
    //JPanel panelEscalas; //Panel para las escalas
    JPanel panelGrafico; //Aqu’ va la Zona grafica
    JPanel panelControles ; //panel para botones y campos de texto,etc
    JPanel DisplayPanel1 = new JPanel(); //Panel grande para la grafica
    JPanel DisplayPanel2 = new JPanel(); //panel grande para todos los controles   
    JFrame fFrame; //ventana de ayuda
    
    int Galto,Gancho;       //dimesiones de la zona de graficación
    int    x0,y0;           //origen
    int    escalaX,escalaY;
    int aumento1,aumento2;   
    int intervaloA=-100;
    int intervaloB = 100;
    int numeroDeInteraciones;
    double xmin,xmax,imgx;

    
    //VARIABLES PARA GROSOR DE LAS LINEAS
    final static BasicStroke grosor1 = new BasicStroke(1.5f); //thickness
    final static float dash1[] = {5.0f};
    final static BasicStroke dashed = new BasicStroke(1.0f,
                                                      BasicStroke.CAP_BUTT, 
                                                      BasicStroke.JOIN_MITER, 
                                                      5.0f, dash1, 0.0f);

    
    public PlotterManual(Container Contenedor,JFrame fra, String funcion) {
        //CREANDO BOTONES
        BtnGraficar = new JButton("Graficar");
        BtnGraficar.setBounds(20, 10, 100, 20);  
        
        
        Btnsalir = new JButton("Salir");
        Btnsalir.setBounds(140, 10, 100, 20); 
        this.add(Btnsalir);
        
        Btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsalirActionPerformed(evt,fra);
            }
        });
        
        campoFuncion = new JTextField(funcion);
        campoFuncion.setBounds(100, 40, 200, 20);
        this.add(campoFuncion);
        
        //COLUMNA 1 <-------------------------------
        
        //COLUMNA 4
        Mensaje = new JLabel("",JLabel.LEFT);
        
        listModel = new DefaultListModel();
        listBusca = new JList(listModel);
        
        Gancho = 900-10;
        Galto = 550;
        //Galto = 70*690/100;
     
        panelGrafico = new ZonaGrafica(); //zona grafica
        panelControles = new JPanel();
        
        scrollPane = new JScrollPane(panelGrafico);///////
        
        DisplayPanel1.setLayout(new BorderLayout());
        DisplayPanel1.add(scrollPane, BorderLayout.CENTER);//panelGrafico
	    
        panelControles.setLayout(new GridLayout(4,2));
        //panelControles.add(campoFuncion);
        this.add(campoFuncion);
        //panelControles.add(BtnGraficar);
        this.add(BtnGraficar);

        panelControles.add(Mensaje);
        setLayout(null);
        JPanel miniPanelintervalos = new JPanel();//mini panel para intervalos a y b
        etiquetaA = new JLabel("Ecuación: ");
        etiquetaA.setBounds(20, 30, 100, 40);
        
        miniPanelintervalos.setLayout(new GridLayout(1,6));
        this.add(etiquetaA);

        panelControles.add(miniPanelintervalos);
     
        JPanel miniPanelInteraciones = new JPanel();
        panelControles.add(miniPanelInteraciones);
	
        JPanel miniPanelNumPuntos = new JPanel();
        panelControles.add(miniPanelNumPuntos);
	
        //BORDES
        Border colorline = BorderFactory.createLineBorder(new Color(220,220,220));
        DisplayPanel1.setBorder(colorline);
        DisplayPanel1.setPreferredSize( new Dimension(Gancho,Galto-20));
	
        DisplayPanel2.setLayout(new BorderLayout(1,1));
        DisplayPanel2.add("Center", panelControles);
     
        Contenedor.setLayout(new BorderLayout());
        Contenedor.add("North",DisplayPanel1);
        Contenedor.add("South",DisplayPanel2);
	 
        //EVALUADOR DE FUNCIONES
        miEvaluador = new JEP();
        miEvaluador.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador.addStandardConstants();
        miEvaluador.addComplex();
        miEvaluador.addFunction("sen", new org.nfunk.jep.function.Sine());//habilitar 'sen'
        miEvaluador.addVariable("x", 0);
        miEvaluador.setImplicitMul(true); //permite 2x en vez de 2*x
        
        miEvaluadorDerivadas = new JEP();
        miEvaluadorDerivadas.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluadorDerivadas.addStandardConstants();
        miEvaluadorDerivadas.addComplex();
        miEvaluadorDerivadas.addFunction("sen", new org.nfunk.jep.function.Sine());//habilitar 'sen'
        miEvaluadorDerivadas.addVariable("x", 0);
        miEvaluadorDerivadas.setImplicitMul(true); //permite 2x en vez de 2*x
        
        escalaX=30;
        escalaY=30;
        x0=Gancho/2;
        y0=Galto/2;
        aumento1=7;
	 
	ManejadorDeEvento ManejadorDevt = new  ManejadorDeEvento();	
	campoFuncion.addActionListener(ManejadorDevt);
        BtnGraficar.addActionListener(ManejadorDevt);
    }

    
//////// CLASE PARA EL MANEJO DE LOS EVENTOS ///////////////////////////////////
private class ManejadorDeEvento implements ActionListener {
    public void actionPerformed (ActionEvent evt) {
        Object source = evt.getSource ();
        //ACTUALIZA LA GRAFICA SI SE OPROME UN BOTON O ENTER EN UN CAMPO DE TEXTO
        if ( source == BtnGraficar || source == campoFuncion){
            panelGrafico.repaint();
        }
    }
}
    private void BtnsalirActionPerformed(java.awt.event.ActionEvent evt,JFrame fra) {
        System.out.println("Este metodo deberia cerrar");
        fra.setVisible(false);     
    }   
    
/////// CLASE QUE DE LA ZONA GRçFICA ///////////////////////////////////////////
public class ZonaGrafica extends JPanel  implements MouseListener, MouseMotionListener, MouseWheelListener {
    int offsetX, offsetY;
    boolean dragging;
    
    ZonaGrafica() {
        setBackground(Color.white);             
        offsetX=x0; offsetY=y0;
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }
    
    
    public void mousePressed(MouseEvent evt) {
        if (dragging)
            return;
        int x = evt.getX();  // clic inicial
        int y = evt.getY();
        offsetX = x - x0;
        offsetY = y - y0;
        dragging = true;
    }

    public void mouseReleased(MouseEvent evt) {
        dragging = false;
        repaint();
    }

    public void mouseDragged(MouseEvent evt) {
        if (dragging == false)
            return;
        int x = evt.getX();   // posici—n del mouse
        int y = evt.getY();
        x0 = x - offsetX;     // mover origen
        y0 = y - offsetY;
        repaint();
    }
    
    public void mouseWheelMoved(MouseWheelEvent evt) {
        int zoom = evt.getWheelRotation();
        escalaY += -zoom;
        escalaX += -zoom;
        repaint();
    }    

    public void mouseMoved(MouseEvent evt) { }
    public void mouseClicked(MouseEvent evt) { }
    public void mouseEntered(MouseEvent evt) { }
    public void mouseExited(MouseEvent evt) { }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graficar(g, x0, y0);                      
    }
 
    //METODO QUE PINTA TODA LA GRçFICA
    void Graficar(Graphics ap, int xg, int yg) {
        //setBackground(new Color(36,85,102)); //COLOR FONDO/////////////////////////////////////////////////
        int xi=0,yi=0,xi1=0,yi1=0,numPuntos=1;
        int cxmin,cxmax,cymin,cymax;
        double valxi=0.0, valxi1=0.0, valyi=0.0,valyi1=0.0;
        Thread animation;

        //convertimos el objeto ap en un objeto Graphics2D para usar los mŽtodos Java2D
        Graphics2D g = (Graphics2D) ap;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g.setFont(ft10); 
        //g.setPaint(new Color(130,216,245));// color ejes

        //PINTAMOS EL EJE X Y EL EJE Y
        g.draw(new Line2D.Double(xg, 10, xg, Galto-10)); //EJE Y
        g.draw(new Line2D.Double(10, yg, Gancho-10, yg));//EJE X

        xmin=-1.0*xg/escalaX;
        xmax=(1.0*(Gancho-xg)/escalaX);
        cxmin=(int)Math.round(xmin); //pantalla
        cxmax=(int)Math.round(xmax);

        puntosInt = 99;
        //intervalos para pintar funci—n
        cymin=(int)Math.round(1.0*(yg-Galto)/escalaY);
        cymax=(int)Math.round(1.0*yg/escalaY);

        numPuntos=Gancho; //num pixels

        g.setPaint(new Color(49,173,215)); //COLOR CUADRICULA
        g.setFont(ft7);

        //PINTAMOS TODOS LOS EJES PARA FORMAR LA CUADRICULA
        if(escalaX>5) {
            for(int i=cxmin;i<=cxmax;i++) {   
                //EJES PARALELOS AL EJE Y
                g.setPaint(new Color(49,173,215)); //COLOR CUADRICULA
                g.draw(new Line2D.Double(xg+i*escalaX, yg-2, xg+i*escalaX , yg+2));
                if( (xg+i*escalaX) != xg )
                    g.draw(new Line2D.Double(xg+i*escalaX, 10, xg+i*escalaX, Galto-10));
                
                if(i>0){
                    g.setPaint(new Color(255,255,255));//COLOR NUMEROS
                    g.drawString(""+i, xg+i*escalaX-aumento1, yg+12);
                }
                if(i<0){
                    g.setPaint(new Color(255,255,255));//COLOR NUMEROS
                    g.drawString(""+i, xg+i*escalaX-8, yg+12);
                }
            }
        }

        if(escalaY>5) {
            for(int i=cymin+1;i<cymax;i++)
            {   //EJES PARALELOS AL EJE X
                g.setPaint(new Color(49,173,215)); //COLOR CUADRICULA
                g.draw(new Line2D.Double(xg-2, yg-i*escalaY, xg+2 , yg-i*escalaY));
                if( (yg-i*escalaY) != yg )
                    g.draw(new Line2D.Double(10, yg-i*escalaY, Gancho-10, yg-i*escalaY));
                if(i>0){
                    g.setPaint(new Color(255,255,255));//COLOR NUMEROS
                    g.drawString(""+i, xg-12,yg-i*escalaY+8 );
                }
                if(i<0){
                    g.setPaint(new Color(255,255,255));//COLOR NUMEROS
                    g.drawString(""+i, xg-14,yg-i*escalaY+8 );
                }
            }
        }
        
        g.setPaint(new Color(29,220,248));//COLOR DE LA FUNCION
        
        g.setStroke(grosor1);
  
        miEvaluador.parseExpression(campoFuncion.getText());
        errorEnExpresion = miEvaluador.hasError(); //hay error?
        
        String derivada = "";

        if(!errorEnExpresion) {
            campoFuncion.setForeground(Color.black);
            
            //CICLO QUE PINTA LA FUNCIîN
            for(int i=(xg+intervaloA*escalaX);i<(xg+intervaloB*escalaY)-1;i++)//numPuntos
            {
                valxi =xmin +i*1.0/escalaX;
                valxi1=xmin+(i+1)*1.0/escalaX;
                miEvaluador.addVariable("x", valxi);
                valyi=miEvaluador.getValue();  
                miEvaluador.addVariable("x", valxi1);
                valyi1 =  miEvaluador.getValue();
                xi =(int)Math.round(escalaX*(valxi));
                yi =(int)Math.round(escalaY*valyi); 
                xi1=(int)Math.round(escalaX*(valxi1));
                yi1=(int)Math.round(escalaY*valyi1); 

                //control de discontinuidades groseras y complejos
                //control de puntos
                if(i%(100-puntosInt)==0){
                    Complex valC = miEvaluador.getComplexValue();
                    //System.out.println("valc "+valC);
                    double imgx = (double)Math.abs(valC.im()); 
                    if(dist(valxi,valyi,valxi1,valyi1)< 1000 && imgx==0)
                    {
                        g.draw(new Line2D.Double(xg+xi,yg-yi,xg+xi1,yg-yi1)); 
                    }
                }
            }//fin del for 
        } else {
            Mensaje.setText(":. Hay un error.");
            campoFuncion.setForeground(Color.red);
        }
        
    }//Graficar
 
    double dist(double xA,double yA, double xB,double yB) {
        return (xA - xB)*(xA - xB)+(yA - yB)*(yA - yB);
    }
  }

}