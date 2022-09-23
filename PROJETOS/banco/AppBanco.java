public class AppBanco {
    public static void main(String[] args){
        Banco b1=new Banco();
        b1.add(new Poupança("TTA2"));
        b1.add(new Poupança("TTB3"));
        b1.add(new Poupança("TTC4"));
        
        b1.showMeDados("TTA2");
        b1.showMeDados("TTB3");
        b1.showMeDados("TTC4");
        b1.renderJuros(0.2);
        b1.showMeDados("TTA2");
        b1.showMeDados("TTB3");
        b1.showMeDados("TTC4");
    }
}
