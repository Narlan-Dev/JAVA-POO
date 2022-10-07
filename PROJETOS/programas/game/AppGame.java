package game;

public class AppGame {
    public static void main(String[] args) {
        Console ps5=new Console();

        ps5.ligar();
        ps5.jogar(new Terraria());
        ps5.fechar();
    }
}
