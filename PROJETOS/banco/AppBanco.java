public class AppBanco {
    public static void main(String[] args){
        Poupança p1=new Poupança("TTA2");
        p1.depositar(100);
        p1.renderJuros(0.2);
        System.out.println(p1.getSaldo());
    }
}
