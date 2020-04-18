package conversor;

public class MetrosKMConversor extends Conversor {

    private static final Double UN_KM = 1000.0;

    @Override
    public String getLabelValor1() {
        
        return "Metros";
    }
    
    @Override
    public String getLabelValor2() {
        
        return "Kilometros";
    }

    @Override
    public String toString() {
        return "Metros - KM";
    }

    @Override
    public Double convertirValor1Valor2(Double valor1) {
        return valor1 / UN_KM;
    }

    @Override
    public Double convertirValor2Valor1(Double valor2) {
        return valor2 * UN_KM;
    }
    
    
}
