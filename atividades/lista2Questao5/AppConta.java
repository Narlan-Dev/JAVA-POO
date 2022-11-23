package lista2Questao5;

public class AppConta {
    public static void main(String[] args) {
        Conta c1=new Conta("Narlan", 202010, "12458-E", 100785.6);
        Data date=new Data(02, 10, 2022);

        c1.showDadosContas(date);
    }

}
