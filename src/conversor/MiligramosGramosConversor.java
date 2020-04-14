/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Gabriel
 */
public class MiligramosGramosConversor extends Conversor {

    private static final Double UN_ML = 1000.0;

    @Override
    public String getLabelValor1() {
        
        return "Miligramos";
    }
    
    @Override
    public String getLabelValor2() {
        
        return "Gramos";
    }

    @Override
    public String toString() {
        return "Miligramos a Gramos";
    }

    @Override
    public Double convertirValor1Valor2(Double valor1) {
        return valor1 / UN_ML;
    }

    @Override
    public Double convertirValor2Valor1(Double valor2) {
        return valor2 * UN_ML;
    }
    
    
}
