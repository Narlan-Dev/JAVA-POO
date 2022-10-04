package lista2Questao7;

public class AppImovel {
    public static void main(String[] args){
        ImovelNovo casaNova = new ImovelNovo(100000, "Rua algustos nevez, n: 789");
        ImovelVelho casaVelha = new ImovelVelho(100000, "Rua algustos nevez, n: 786");

        casaNova.showMePreço();
        casaVelha.showMePreço();
        ImovelNovo.showMeAdicional();
        ImovelVelho.showMeAdicional();
    }
}
