package lista2Questao5;

public class Conta {
    private String nome;
    private int numero;
    private String agencia;
    private double saldo;

    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public double calculaRendimento(){
        return(this.saldo += this.saldo*0.1);   
    }
    public void showDadosContas(Data date){
        System.out.format("\n\nNome do titular: %s", nome);
        System.out.format("\nNumero: %d", numero);        
        System.out.format("\nAgência: %s", agencia);        
        System.out.format("\nSaldo: %f", saldo);  
        date.formatar();              
    }
    public Conta(String nome, int numero, String agencia, double saldo){
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo; 
    }
}
