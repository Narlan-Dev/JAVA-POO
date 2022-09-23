public class Banco {
    private Conta[] contas;
    private Poupança [] poupanças=new Poupança[3];
    private int prox;
    private double rendimento;

    /*public Banco(int tam){
        //Cliente[] clientes = new Cliente[tam];
    }*/
    public void add(Poupança p){
        this.poupanças[prox++]=p;
    }
    public void depositar(String numero, double valor){
        for(int i=0; i<prox; i++){
            if(contas[i].getNumero().equals(numero)){
                contas[i].depositar(valor);
            }
        }
    }
    public void renderJuros(double taxa){
        for(int c=0; c<prox; c++){
            this.rendimento=poupanças[c].getSaldo()*taxa;
            poupanças[c].setSaldo(this.rendimento);
        }
    }
    public void showMeDados(String numero){
        for(int c=0; c<prox; c++){
            if(poupanças[c].getNumero().equals(numero)){
                System.out.format("\n\nConta: %s", poupanças[c].getNumero());
                System.out.format("\n\nSaldo: %f", poupanças[c].getSaldo());
            }
        }
    }
}