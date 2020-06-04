/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionDeSistemas;

import java.math.BigDecimal;
import java.math.MathContext;

class BuscarMayor {
    BigDecimal mayor;
    int fila;
}

/**
 *
 * @author Atabord
 */
public class GaussMethods {
    
    
    public static BigDecimal[][] obtenerAumentada(BigDecimal[][] A, BigDecimal[] b) {
        BigDecimal[][] matrizAumentada = null;
        for(int i=0; i < A.length; i++) {
            matrizAumentada[i] = A[i];
            matrizAumentada[i][A[i].length] = b[i];
        }
        return matrizAumentada;
    }
    
    /**
     * 
     * @param Ab Matriz aumentada
     * @param n Numero de filas o columnas de la matriz - 1 (debido al manejo de listas en java)
     * @param k Etapa
     * @return Matriz reducida
     */
    public static BigDecimal[][] Reduccion(BigDecimal[][] Ab, int n, int k){
        for(int i = k+1; i <= n; i++) {
            BigDecimal mult = Ab[i][k].divide(Ab[k][k], MathContext.DECIMAL128);
            //System.out.println("mult fila"+ i + " "+mult);
            for(int j = k; j <= n+1; j++) {
                Ab[i][j] = Ab[i][j].subtract(mult.multiply(Ab[k][j]));
                System.out.print(Ab[i][j] + " ");
            }
            System.out.print("\n");
        }
        return Ab;
    }
    
    private static BuscarMayor BuscarMayorEnColumna(BigDecimal[][] Ab, int k, int n){
        BuscarMayor object = new BuscarMayor();
        BigDecimal mayor = Ab[k][k];
        int filaM = k;
        for(int m = k; m <= n; m ++){
            if(Math.abs(Ab[m][k].doubleValue()) > Math.abs(mayor.doubleValue())){
                mayor = Ab[m][k];
                filaM = m;
            }
        }
        object.mayor = mayor;
        object.fila = filaM;
        return object;
    }
    
    public static BigDecimal[][] CambiarFila(BigDecimal[][] Ab, int k, int filaM){
        BigDecimal[] Aux = Ab[k];
        Ab[k] = Ab[filaM];
        Ab[filaM] = Aux;
        System.out.println("Se intercambio la fila " + k + "  por la fila " + filaM);
        return Ab;
    }
    
    public static BigDecimal[][] GaussSimple(BigDecimal[][] Ab, int n) {
        for(int k = 0; k <= n-1; k++) {
            System.out.println("Etapa " + (k+1));
            Ab = Reduccion(Ab, n, k);
        }
        return Ab;
    }
    
    public static BigDecimal[][] PivoteoParcial(BigDecimal[][]Ab, int n) {
        for (int k = 0; k <= n-1; k++) {
            System.out.println("Etapa " + (k+1));
            BuscarMayor buscarMayor = BuscarMayorEnColumna(Ab, k, n);
            BigDecimal mayor = buscarMayor.mayor;
            int filaM = buscarMayor.fila;
            System.out.println("Mayor: "+ mayor + " filaMayor: "+ filaM);
            if(mayor == BigDecimal.ZERO) {
                throw new ArithmeticException("El sistema tiene infinitas/cero soluciones");
            }
            if(k != filaM) {
                Ab = CambiarFila(Ab, k, filaM);
            }
            Ab = Reduccion(Ab, n, k);
        }
        return Ab;
    }
    
    /*
     * 
     * @param A Matriz
     * @param b Columna a la que se iguala la matriz
     * @param n Numero de filas o columas de la matriz - 1 (dabido al manejo de listas en java)
     * @return Matriz reducida
     *
    public static BigDecimal[][] Reduccion(BigDecimal[][] A, BigDecimal[] b,int n){
        BigDecimal[][] matrizAumentada = obtenerAumentada(A, b);
        return Reduccion(matrizAumentada, n);
    }
    */
    
    /**
     * 
     * @param A Matriz
     * @param b Columna a la que se iguala la matriz
     * @param n Numero de filas o columas de la matriz - 1 (dabido al manejo de listas en java)
     * @return 
     */
    public static BigDecimal[] Sustitucion(BigDecimal[][] A, BigDecimal[] b, int n) {
        BigDecimal[][] matrizAumentada = obtenerAumentada(A, b);
        return Sustitucion(matrizAumentada, n);
    }
    
        /**
     * 
     * @param Ab Matriz Aumentada
     * @param n Numero de filas o columas de la matriz - 1 (dabido al manejo de listas en java)
     * @return Lista de X
     */
    public static BigDecimal[] Sustitucion(BigDecimal[][] Ab, int n) {
        if(Ab[n][n] == BigDecimal.ZERO){
            throw new ArithmeticException("El sistema tiene infinitas/cero soluciones");
        }
        BigDecimal[] X = new BigDecimal[n+1];
        X[n]= Ab[n][n+1].divide(Ab[n][n], MathContext.DECIMAL128);
        System.out.println("X"+(n+1)+ "= "+ X[n]);
        for(int i = n-1; i >= 0; i--) { 
            BigDecimal sumatoria = BigDecimal.ZERO;
            for(int j = i+1; j <= n; j++){
                sumatoria = sumatoria.add(Ab[i][j].multiply(X[j]));
            }
            if(Ab[i][i] == BigDecimal.ZERO){
                throw new ArithmeticException("El sistema tiene infinitas soluciones");
            }
            X[i] = (Ab[i][n+1].subtract(sumatoria)).divide(Ab[i][i], MathContext.DECIMAL128);
            System.out.println("X"+(i+1)+ "= "+ X[i]);
        }
        return X;
    }
}
