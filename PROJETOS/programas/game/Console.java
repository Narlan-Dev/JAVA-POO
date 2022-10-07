package game;

public class Console {
    private Jogo game;
    private boolean estatic;
    
    public void ligar(){
        System.out.println("Ligando o console...");
        System.out.println(("Ligado!!"));
        this.estatic = true;
    }
    public void jogar(Jogo game){
        if(estatic){
            System.out.println("Iniciando o jogo...");
            this.game=game;
            game.jogar();
        }else{System.out.println("Console desligado");}
    }
    public void fechar(){
        if(estatic){
            if(game != null){
                //System.out.println("Fechando o jogo...");
                game.fechar();
                game = null;
            }else{System.out.println("Nenhum jogo iniciado!");}
        }else{System.out.println("Console desligado");}
    }
}
