/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.math.BigDecimal;

/**
 *
 * @author Usuario
 */
public class ContenedorEcuaciones {
    
    private static ContenedorEcuaciones contenedor;
    BigDecimal ecuaciones[][];

    private ContenedorEcuaciones() {
    }

    public static ContenedorEcuaciones getContenedor() {
        if(contenedor == null){
            contenedor = new ContenedorEcuaciones();
        }
        return contenedor;
    }

    public void setContenedor(ContenedorEcuaciones contenedor) {
        this.contenedor = contenedor;
    }

    public BigDecimal[][] getEcuaciones() {
        return ecuaciones;
    }

    public void setEcuaciones(BigDecimal[][] ecuaciones) {
        this.ecuaciones = ecuaciones;
    }
    
    
    
}
