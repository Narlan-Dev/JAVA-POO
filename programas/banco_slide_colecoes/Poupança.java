package banco_slide_colecoes;

public class Poupança extends Conta implements Juros{
    private double valor;
    public Poupança(String numero){
        super(numero);
    }
    public void renderJuros(double taxa){
        this.valor=getSaldo()*taxa;
        setSaldo(this.valor);
    }
}
