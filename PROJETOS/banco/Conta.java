public class Conta {
    private String numero;
    private double saldo;
    
    public Conta(String numero){
        this.numero=numero;
        this.saldo=100;
    }
    public String getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double rendimento){
        this.saldo+= rendimento;
    }
    public void depositar(double valor){
        saldo=getSaldo()+valor;
    }
}