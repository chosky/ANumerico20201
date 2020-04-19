/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import org.nfunk.jep.JEP;
/**
 *
 * @author Jose David Henao Ocampo
 */
public class MathFunctionsParser {
    public JEP function = new JEP();
    
    public MathFunctionsParser() {
        this.function.addStandardFunctions();
        this.function.addStandardConstants();
        this.function.addComplex();
        this.function.addFunction("sen", new org.nfunk.jep.function.Sine());
        this.function.addVariable("x", 0);
        this.function.setImplicitMul(true);
    }
    
    public void parserFunction(String function) {
        this.function.parseExpression(function);
    }
    
}
