package lista2Questao7;

public class ImovelNovo extends Imovel {
    private static double adicional= 3500;

    public static double getAdicional(){return ImovelNovo.adicional;}
    public static void setAdicional(double valor){ImovelNovo.adicional += valor;}
    public static void showMeAdicional(){System.out.format("\n\nO valor adicional no imovel novo: %f", ImovelNovo.adicional);}
    public void showMePreço(){System.out.format("\n\nO valor do desconto no imovel: %f", getPreço());}
    public ImovelNovo(double preço, String endereço){super((preço + adicional), endereço);}
}
