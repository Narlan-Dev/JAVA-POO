public class Banco {
    private Conta[] contas;
    private Poupança[] poupanças;
    private int prox;
    private double money;
    /*public Banco(int tam){
        Cliente clientes = new Cliente[tam];
    }*/
    /*public void add(Conta c){
        clientes[prox++]=c;
    }*/
    public void depositar(String numero, double valor){
        for(int i=0; i<prox; i++){
            if(contas[i].getNumero().equals(numero)){
                contas[i].depositar(valor);
            }
        }
    }
    public void renderJuros(double taxa){
        for(int c=0; c<prox; c++){
            this.money=poupanças[c].getSaldo()*taxa;
            poupanças[c].setSaldo(this.money);
        }
    }
}