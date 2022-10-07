package banco;

import java.util.Scanner;
public class AppBanco {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        Metodo metodo=new Metodo();
        Banco b1=new Banco();
        
        System.out.println("\n\nInsira o numero da contaPoupança: ");
        while(b1.add(new Poupança(teclado.nextLine())));

        b1.showMeDados("TT01");
        b1.showMeDados("TT02");
        b1.showMeDados("TT03");

        metodo.render(b1, 0.2);

        b1.showMeDados("TT01");
        b1.showMeDados("TT02");
        b1.showMeDados("TT03");
    }
}
