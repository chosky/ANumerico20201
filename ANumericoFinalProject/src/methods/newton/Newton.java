/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods.newton;

/**
 *
 * @author Usuario
 */
public class Newton {
    
    
    public void newton(double x0,int iteraciones,double tolerancia){
        double fx = 0/*= f(x0)*/;
        double dfx = 0 /*f1(x0) */;
        if(fx == 0){
            System.out.println(x0 +" es una raiz");
        }else if(dfx == 0){
            System.out.println(x0+" Es una posible raiz multiple");
        }else if(tolerancia < 0){
            System.out.println(tolerancia + "Mal valor para tolerancia");
        }else if(iteraciones <= 0){
                 System.out.println(iteraciones + "Entrada erronea para tolerancia");
        }else{
            int contador = 0;
            double error = tolerancia + 1;
            double xn = 0;
            while((error > tolerancia) && (fx != 0)&&(dfx!=0) && (contador < iteraciones)){
                /*xn = x0 -(fx/dfx);
                fx = f(xn);
                dfx = f1(xn);
                error = Math.abs(xn-x0);
                x0 = xn;
                contador++;*/
            }
            if(fx == 0){
                System.out.println(x0 + " Es una raiz");
            }else if(dfx==0){
                System.out.println(x0 + " Es una posible raiz multiple");
            }else if(error < tolerancia){
                System.out.println(x0 + " se aproxima a la tolerancia");
            }else{
                System.out.println("El metodo fracaso en " + iteraciones + " iteraciones");
            }
        }
    }
}
