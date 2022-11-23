package lista2Questao5;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public void formatar(){
        System.out.format("\nData: %d/%d/%d", dia, mes, ano);
    }
    public Data(int day, int mes, int year){
        this.dia=day;
        this.mes=mes;
        this.ano=year;
    }
}
