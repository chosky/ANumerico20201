/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Usuario
 */
public class ContenedorEcuacion {
    String ecuacion,derivada1,derivada2,derivada3;
    
    private static ContenedorEcuacion contenedor;

    private ContenedorEcuacion() {
    }

    public String getEcuacion() {
        return ecuacion;
    }

    public void setEcuacion(String ecuacion) {
        this.ecuacion = ecuacion;
    }

    public static ContenedorEcuacion getContenedor() {
        if(contenedor == null){
            contenedor = new ContenedorEcuacion();
        }
        return contenedor;
    }

    public static void setContenedor(ContenedorEcuacion contenedor) {
        ContenedorEcuacion.contenedor = contenedor;
    }

    public String getDerivada1() {
        return derivada1;
    }

    public void setDerivada1(String derivada1) {
        this.derivada1 = derivada1;
    }

    public String getDerivada2() {
        return derivada2;
    }

    public void setDerivada2(String derivada2) {
        this.derivada2 = derivada2;
    }

    public String getDerivada3() {
        return derivada3;
    }

    public void setDerivada3(String derivada3) {
        this.derivada3 = derivada3;
    }
    
    
    
}
