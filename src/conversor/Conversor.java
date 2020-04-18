package conversor;

public abstract class Conversor {
    
    public abstract String getLabelValor1();
    public abstract String getLabelValor2();
    public abstract Double convertirValor1Valor2(Double valor1);
    public abstract Double convertirValor2Valor1(Double valor1);
}
