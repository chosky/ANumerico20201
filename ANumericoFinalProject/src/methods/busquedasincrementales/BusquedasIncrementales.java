/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods.busquedasincrementales;

/**
 *
 * @author Usuario
 */
public class BusquedasIncrementales {
    private double[] busquedaincremental(int inicioEvaluacion){
        double cotainferior = evaluarfuncion(inicioEvaluacion);
        inicioEvaluacion++;
        double cotasuperior = evaluarfuncion(inicioEvaluacion);
        boolean signo = signosiguales(cotainferior,cotasuperior);
        while(signo){
            inicioEvaluacion++;
            cotainferior = cotasuperior;
            cotasuperior = evaluarfuncion(inicioEvaluacion);
            signo = signosiguales(cotainferior,cotasuperior);
        }
        return new double[]{cotainferior,cotasuperior};
    }

    private double evaluarfuncion(double valor){
        System.out.println("Funcion evaluada en " + valor);
        return 1;
    }

    private boolean signosiguales(double cotainferior, double cotasuperior){
        if((cotainferior >= 0 && cotasuperior >= 0) || (cotainferior < 0 && cotasuperior < 0)){
            return true;
        }else {
            return false;
        }
    }
}
