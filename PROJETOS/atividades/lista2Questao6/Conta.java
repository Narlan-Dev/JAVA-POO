package lista2Questao6;

public abstract class Conta {
    private String nome;
    private int numero;
    private double saldo;

    public double getSaldo(){return this.saldo;}
    public void setSaldo(double saldo){this.saldo = saldo;}
    public String getNome(){return this.nome;}  
    public int getNumero(){return this.numero;}   
    public void depositar(double valor){this.saldo += valor;}
    public void sacar(double valor){this.saldo -= valor;}   
    public Conta(String nome, int numero, double saldo){
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }
}
