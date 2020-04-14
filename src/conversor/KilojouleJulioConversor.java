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
public class KilojouleJulioConversor extends Conversor {

    private static final Double UN_KL = 1000.0;

    @Override
    public String getLabelValor1() {
        
        return "Kilojoule";
    }
    
    @Override
    public String getLabelValor2() {
        
        return "Julio";
    }

    @Override
    public String toString() {
        return "Kilojoule a Julio";
    }

    @Override
    public Double convertirValor1Valor2(Double valor1) {
        return valor1 * UN_KL;
    }

    @Override
    public Double convertirValor2Valor1(Double valor2) {
        return valor2 / UN_KL;
    }
    
    
}
