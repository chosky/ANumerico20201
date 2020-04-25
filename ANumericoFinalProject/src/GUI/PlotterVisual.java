package GUI;

import java.awt.Container;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Smith Alexis Carvajal
 */
public class PlotterVisual extends JFrame {
    
    PlotterVisual(String function){
      initPlotter(function);
    }
    private void initPlotter(String function){
        setSize(800,690);//500,350
        setTitle("GRAFICADOR");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    
        Container Contenedor = getContentPane();
        PlotterManual mipanel = new PlotterManual(Contenedor,this, function);
        this.add(mipanel);
        setVisible(true);   
    }
}
