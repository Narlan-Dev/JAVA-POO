package lista2Questao7;

public class ImovelVelho extends Imovel{
    private static double adicional= 2500;

    public static double getAdicional(){return ImovelVelho.adicional;}
    public static void setAdicional(double valor){ImovelVelho.adicional += valor;}
    public static void showMeAdicional(){System.out.format("\n\nO valor do desconto no imovel velho: %f", ImovelVelho.adicional);}
    public void showMePreço(){System.out.format("\n\nO valor do desconto no imovel: %f", getPreço());}
    public ImovelVelho(double preço, String endereço){super((preço - adicional), endereço);}
}
