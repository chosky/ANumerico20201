/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionDeSistemas;

import java.math.BigDecimal;
import java.math.MathContext;

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
     * @return Matriz reducida
     */
    public static BigDecimal[][] Reduccion(BigDecimal[][] Ab, int n){
        BigDecimal mult;
        for(int k = 0; k <= n-1; k++) {
            System.out.println("Etapa " + k);
            for(int i = k+1; i <= n; i++) {
                mult = Ab[i][k].divide(Ab[k][k], MathContext.DECIMAL128);
                System.out.println("mult fila"+ i + " "+mult);
                for(int j = k; j <= n+1; j++) {
                    Ab[i][j] = Ab[i][j].subtract(mult.multiply(Ab[k][j]));
                }
            }
        }
        return Ab;
    }
    
    /**
     * 
     * @param A Matriz
     * @param b Columna a la que se iguala la matriz
     * @param n Numero de filas o columas de la matriz - 1 (dabido al manejo de listas en java)
     * @return Matriz reducida
     */
    public static BigDecimal[][] Reduccion(BigDecimal[][] A, BigDecimal[] b,int n){
        BigDecimal[][] matrizAumentada = obtenerAumentada(A, b);
        return Reduccion(matrizAumentada, n);
    }
    
    /**
     * 
     * @param A Matriz
     * @param b Columna a la que se iguala la matriz
     * @param n Numero de filas o columas de la matriz - 1 (dabido al manejo de listas en java)
     * @return 
     */
    public static BigDecimal[] Sustitucion(BigDecimal[][] A, BigDecimal[] b, int n) {
        BigDecimal[] X = new BigDecimal[n+1];
        BigDecimal sumatoria = BigDecimal.ZERO;
        X[n]= b[n].divide(A[n][n], MathContext.DECIMAL128);
        for(int i = n-1; i >= 0; i--) {
            for(int j = i+1; j <= n; j++){
                sumatoria = sumatoria.add(A[i][j].multiply(X[j]));
            }
            X[i] = (b[i].subtract(sumatoria)).divide(A[i][i]);
        }
        return X;
    }
    
    public static BigDecimal[] Sustitucion(BigDecimal[][] Ab, int n) {
        if(Ab[n][n] == BigDecimal.ZERO){
            throw new ArithmeticException("El sistema tiene infinitas soluciones");
        }
        BigDecimal[] X = new BigDecimal[n+1];
        X[n]= Ab[n][n+1].divide(Ab[n][n], MathContext.DECIMAL128);
        System.out.println("X"+(n+1)+ "= "+ X[n]);
        for(int i = n-1; i >= 0; i--) { 
            BigDecimal sumatoria = BigDecimal.ZERO;
            for(int j = i+1; j <= n; j++){
                if(Ab[i][j] == BigDecimal.ZERO){
                    throw new ArithmeticException("El sistema tiene infinitas soluciones");
                }
                sumatoria = sumatoria.add(Ab[i][j].multiply(X[j]));
            }
            X[i] = (Ab[i][n+1].subtract(sumatoria)).divide(Ab[i][i], MathContext.DECIMAL128);
            System.out.println("X"+(i+1)+ "= "+ X[i]);
        }
        return X;
    }
}
