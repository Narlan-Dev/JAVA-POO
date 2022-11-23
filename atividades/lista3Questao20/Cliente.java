package lista3Questao20;

public class Cliente extends Paciente {
    private String data;
    private String hora;

    public String getData(){return this.data;}
    public String getHora(){return this.hora;}
    public void exibeCleinte(Cliente c){
        //imprime cpf, nome e telefone do cliente
    }
    public Cliente(String cpf, String nome, String telefone, String data, String hora){
        super(cpf, nome, telefone);
        this.data = data;
        this.hora = hora;
    }
}
