/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author jhenaoo
 */
public class PlotterVisual extends JFrame {
    
    PlotterVisual(String funcion){
        setSize(800,690);//500,350
        setTitle("interfaz grafica");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    
        Container Contenedor = getContentPane();
        PlotterManual mipanel = new PlotterManual(Contenedor,this, funcion);
        this.add(mipanel);
        setVisible(true);         
    }
}
