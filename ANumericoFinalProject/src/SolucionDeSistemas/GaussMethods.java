/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionDeSistemas;

import java.math.BigDecimal;
import java.math.MathContext;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class BuscarMayor {
    BigDecimal mayor;
    int columna;
    int fila;
}

/**
 *
 * @author Atabord
 */
public class GaussMethods {
    
    private static void mostrarEtapa(JTable table, int etapa, int n) {
       DefaultTableModel model = (DefaultTableModel)table.getModel();
       String[] row = new String[n];
       row[0] = "Etapa "+ (etapa+1);
       model.addRow(row);
       table.setModel(model);
    }
    
    private static void mostrarMatriz(JTable table, BigDecimal[][]Ab) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        for(int i = 0; i < Ab.length; i++) {
            model.addRow(Ab[i]);
        }
        model.addRow(new Object[Ab.length]);
        table.setModel(model);
    }
    
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
            for(int j = k; j <= n+1; j++) {
                Ab[i][j] = Ab[i][j].subtract(mult.multiply(Ab[k][j], MathContext.DECIMAL128), MathContext.DECIMAL128);
            }
            Ab[i][k] = BigDecimal.valueOf(Ab[i][k].intValue());
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
        return Ab;
    }
    
    public static BigDecimal[][] cambiarColumna(BigDecimal[][] Ab, int k, int columnaM, int[] marcas){
        BigDecimal aux[];
        aux = new BigDecimal[Ab.length-1];        
        for (int i = 1; i <= k; i++) {
            aux[i] = Ab[i][columnaM];
            Ab[i][columnaM] = Ab[i][k];
            Ab[i][k] = aux[i];
            
	}
	return Ab;
    }
    
    public static int[] cambiarMarcas(int[] marcas, int k, int columnaM){
        int aux = marcas[columnaM];
        marcas[columnaM] = marcas[k];
        marcas[k] = aux;
        
        return marcas;
    }
    
    public static BigDecimal[][] GaussSimple(BigDecimal[][] Ab, int n, JTable table) {
        for(int k = 0; k <= n-1; k++) {
            mostrarEtapa(table, k, n);
            Ab = Reduccion(Ab, n, k);
            mostrarMatriz(table, Ab);
        }
        return Ab;
    }
    
    public static BigDecimal[][] PivoteoParcial(BigDecimal[][]Ab, int n, JTable table) {
        for (int k = 0; k <= n-1; k++) {
            mostrarEtapa(table, k, n);
            BuscarMayor buscarMayor = BuscarMayorEnColumna(Ab, k, n);
            BigDecimal mayor = buscarMayor.mayor;
            int filaM = buscarMayor.fila;
            if(mayor == BigDecimal.ZERO) {
                throw new ArithmeticException("El sistema tiene infinitas/cero soluciones");
            }
            if(k != filaM) {
                Ab = CambiarFila(Ab, k, filaM);
            }
            Ab = Reduccion(Ab, n, k);
            mostrarMatriz(table, Ab);
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
        for(int i = n-1; i >= 0; i--) { 
            BigDecimal sumatoria = BigDecimal.ZERO;
            for(int j = i+1; j <= n; j++){
                sumatoria = sumatoria.add(Ab[i][j].multiply(X[j]));
            }
            if(Ab[i][i] == BigDecimal.ZERO){
                throw new ArithmeticException("El sistema tiene infinitas soluciones");
            }
            X[i] = (Ab[i][n+1].subtract(sumatoria)).divide(Ab[i][i], MathContext.DECIMAL128);
        }
        return X;
    }
    
    public static BuscarMayor buscarMayorEnMatriz(BigDecimal[][] Ab, int k, int n){
        BuscarMayor object = new BuscarMayor();
        BigDecimal mayor = Ab[k][k];
        int columnaM = k;
        int filaM = k;
        for(int m = k; m <= n; m ++){
            for(int i = k; i <= n ; i++){
                if(Math.abs(Ab[m][i].doubleValue()) > Math.abs(mayor.doubleValue())){
                   mayor = Ab[m][i];
                   filaM = m;
                   columnaM = i;
                }   
            }
            
        }
        object.mayor = mayor;
        object.fila = filaM;
        object.columna = columnaM;
        return object;
    }
            
    public static BigDecimal[][] pivoteoTotal(BigDecimal[][]Ab, int n, JTable table){
        int marcas[];
        marcas = new int[n];
        for(int i = 0; i < n; i++){
            marcas[i]= i;
        }
        for (int k = 0; k < n; k++) {
            mostrarEtapa(table, k, n);
            BuscarMayor buscarMayor = buscarMayorEnMatriz(Ab, k, n);
            
            BigDecimal mayor = buscarMayor.mayor;
            int filaM = buscarMayor.fila;
            int columnaM = buscarMayor.columna;
            if(mayor == BigDecimal.ZERO) {
                throw new ArithmeticException("El sistema tiene infinitas/cero soluciones");
            }
            if(k != filaM) {
                Ab = CambiarFila(Ab, k, filaM);
            }
            if(k != columnaM){
                Ab = cambiarColumna(Ab, k, columnaM, marcas);
                marcas = cambiarMarcas(marcas, k, columnaM);
            }                
            Ab = Reduccion(Ab, n, k);
            mostrarMatriz(table, Ab);
        }
        return Ab;
    }
    
    public static BigDecimal[][] pivoteoEscalonado(BigDecimal[][] Ab, int n, JTable table) {
	BigDecimal[] mayoresFilas;
	mayoresFilas = buscarMayoresFilas(Ab, n);
	for (int k = 0; k < n; k++) {
            mostrarEtapa(table, k, n);
            BuscarMayor buscarMayor = buscarMayorEnMayoresFilas(Ab, k, n, mayoresFilas);
            BigDecimal mayor = buscarMayor.mayor;
            int filaM = buscarMayor.fila;
            if(mayor == BigDecimal.ZERO) {
                throw new ArithmeticException("El sistema tiene infinitas/cero soluciones");
            }
            if(k != filaM) {
                Ab = CambiarFila(Ab, k, filaM);
            }
            Ab = Reduccion(Ab, n, k);
            mostrarMatriz(table, Ab);
        }
        return Ab;
    }

    public static BigDecimal[] buscarMayoresFilas(BigDecimal[][] Ab, int n) {
	BigDecimal[] mayoresFilas = new BigDecimal[n];
        BigDecimal mayor = Ab[0][0];
        for(int i = 0; i < n; i ++){
	    for(int j = 0; j < n; j++) {
	    	if(Math.abs(Ab[i][j].doubleValue()) > Math.abs(mayor.doubleValue())){
                    mayor = Ab[i][j];
                    mayoresFilas[i] = mayor.abs();
                    System.out.println(mayoresFilas[i]);
            	}
	    } 
        }
        return mayoresFilas;
    }

    public static BuscarMayor buscarMayorEnMayoresFilas(BigDecimal[][] Ab, int k, int n, BigDecimal[] mayoresFilas) {
	BuscarMayor object = new BuscarMayor();
        BigDecimal mayor = Ab[k][k];
        int filaM = k;
        for(int i = 0; i < n; i ++) {
	        System.out.println(mayoresFilas[i]);
                System.out.println(Ab[k][i]);
            if(Math.abs(mayoresFilas[i].divide(Ab[k][i]).doubleValue()) > Math.abs(mayor.doubleValue())){
                mayor = Ab[k][i];
                filaM = i;
            }
        }
        object.mayor = mayor;
        object.fila = filaM;
        return object;
    }
    
}
