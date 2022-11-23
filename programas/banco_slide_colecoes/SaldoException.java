package banco_slide_colecoes;

public class SaldoException extends Exception {
    public SaldoException(double valor){
        super("Saldo insuficiente para sacar o valor: " + valor);
    }
}
