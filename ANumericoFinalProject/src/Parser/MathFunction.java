/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

/**
 *
 * @author Atabord
 */
public class MathFunction {
    private String function;
    private String firstDerivate;
    private String secondDerivate;

    public void setFunction(String f) {
        this.function = f;
    }
    
    public void setFirstDerivate(String f) {
        this.firstDerivate = f;
    }
    
    public void setSecondDerivate(String f) {
        this.secondDerivate = f;
    }
    
    public String getFunction() {
        return this.function;
    }
    
    public String getFisrtDerivate() {
        return this.function;
    }
    
    public String getSecondDerivate() {
        return this.function;
    }
}
