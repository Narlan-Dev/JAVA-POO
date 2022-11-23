package lista2Questao7;

public abstract class Imovel {
    private double preço;
    private String endereço;
    
    public double getPreço(){return this.preço;}
    public String getEndereço(){return this.endereço;}
    public Imovel(double preço, String endereço){
        this.preço = preço;
        this.endereço = endereço;
    }
}
