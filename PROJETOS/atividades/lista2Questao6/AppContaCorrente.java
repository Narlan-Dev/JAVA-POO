package lista2Questao6;

public class AppContaCorrente {
    public static void main(String[] args){
        ContaCorrrente c1 = new ContaCorrrente("Madara", 188854, 100);

        System.out.format("\n\nSaldo inicial: %f", c1.getSaldo());
        c1.depositar(100);
        System.out.format("\nNovo saldo: %f", c1.getSaldo());
        c1.sacar(100);
        System.out.format("\nSaldo final: %f", c1.getSaldo());
    }
}
