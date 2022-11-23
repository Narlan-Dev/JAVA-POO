package banco_slide_colecoes;

public class ContaNaoEncontradaException extends Exception {
    public ContaNaoEncontradaException(String numero){
        super("Conta "+numero+ " inexistente!");
    }
}
