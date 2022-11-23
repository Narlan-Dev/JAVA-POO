package banco_slide_colecoes;

public class Banco implements Juros {
    private final int MAX = 3;
    private Conta[] contas;
    private Poupança [] poupanças=new Poupança[MAX];
    private int prox = 0;
    private double rendimento;

    public boolean add(Poupança p){
        if(prox < MAX){
            this.poupanças[prox++]=p;
            if((MAX-prox)==0){
            System.out.println("\n\nNumero maximo de contas atingido!!");    
            return false;   
            }else{return true;}
        }
        return false;
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
    public int pesquisa(String  numero){
        for(int i=0; i<prox; i++){if(poupanças[i].getNumero().equals(numero)){return i;}}
        return 0;
    }
    public void debitar(String numero, double valor) throws ContaNaoEncontradaException, SaldoException{
        if(pesquisa(numero)==0){
            throw new ContaNaoEncontradaException(numero);
        }else{
            if(poupanças[pesquisa(numero)].getSaldo() < valor){
                throw new SaldoException(valor);
            }else{
                poupanças[pesquisa(numero)].debitar(valor);
            }
        }
    }
    public void showMeDados(String numero){
        for(int c=0; c<prox; c++){
            if(poupanças[c].getNumero().equals(numero)){
                System.out.format("\n\nConta: %s", poupanças[c].getNumero());
                System.out.format("\nSaldo: %f", poupanças[c].getSaldo());
            }
        }
    }
}