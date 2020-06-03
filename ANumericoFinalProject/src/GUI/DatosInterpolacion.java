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
public class DatosInterpolacion {
    private BigDecimal[]x;
    private BigDecimal[]xn;
    
    private static DatosInterpolacion datosInterpolacion;

    public DatosInterpolacion() {
    }

    public static DatosInterpolacion getDatosInterpolacion() {
        if(datosInterpolacion == null){
            datosInterpolacion = new DatosInterpolacion();
        }
        return datosInterpolacion;
    }

    public BigDecimal[] getX() {
        return x;
    }

    public void setX(BigDecimal[] x) {
        this.x = x;
    }

    public BigDecimal[] getXn() {
        return xn;
    }

    public void setXn(BigDecimal[] xn) {
        this.xn = xn;
    }
    
    
}
