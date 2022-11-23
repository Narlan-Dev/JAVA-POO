package banco_slide_colecoes;

public abstract class Conta {
    private String numero;
    private double saldo;
    
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
    public void debitar(double valor) throws SaldoException{
        if(this.saldo < valor){
            throw new SaldoException(valor);
        }else{
            this.saldo -= valor;
        }
    }
    public Conta(String numero){
        this.numero=numero;
        this.saldo=100;
    }
}