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
public class SegundosMinutosConversor extends Conversor {

    private static final Double UN_MI = 60.0;

    @Override
    public String getLabelValor1() {
        
        return "Segundos";
    }
    
    @Override
    public String getLabelValor2() {
        
        return "Minutos";
    }

    @Override
    public String toString() {
        return "Segundos a Minutos";
    }

    @Override
    public Double convertirValor1Valor2(Double valor1) {
        return valor1 / UN_MI;
    }

    @Override
    public Double convertirValor2Valor1(Double valor2) {
        return valor2 * UN_MI;
    }
    
    
}
