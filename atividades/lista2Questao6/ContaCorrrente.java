package lista2Questao6;

public class ContaCorrrente extends Conta{
    @Override public void depositar(double valor){setSaldo(valor+getSaldo());}
    @Override public void sacar(double valor){setSaldo(getSaldo()-(valor+(valor * 0.005)));}
    public ContaCorrrente(String nome, int numero, double saldo){super(nome, numero, saldo);}
}
