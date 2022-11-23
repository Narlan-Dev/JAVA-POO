package banco_slide_colecoes;

import java.util.Scanner;
public class AppBanco {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        Metodo metodo=new Metodo();
        Banco b1=new Banco();
        Poupança p1 = new Poupança("TT01");
        Poupança p2 = new Poupança("TT02");
        
        b1.add(p1);
        b1.add(p2);

        p1.depositar(100);
        try{
            p1.debitar(201);
        }catch(SaldoException e){
            System.out.println(e.getMessage());
        }
        try{
            b1.debitar("TT02", 101);
        }catch(ContaNaoEncontradaException e){
            System.out.println(e.getMessage());
        }catch(SaldoException e) {
            System.out.println(e.getMessage());
        }

        /*b1.showMeDados("TT01");
        b1.showMeDados("TT02");
        b1.showMeDados("TT03");

        metodo.render(b1, 0.2);

        b1.showMeDados("TT01");
        b1.showMeDados("TT02");
        b1.showMeDados("TT03");*/
    }
}
