package lista2Questao20;

public abstract class Paciente {
    private String cpf;
    private String nome;
    private String telefone;
    private String data;
    private String hora;
    
    public String getCpf(){return this.cpf;}
    public String getNome(){return this.nome;}
    public String getTelefone(){return this.telefone;}
    public String getData(){return this.data;}
    public String getHora(){return this.hora;}
    public Paciente(String cpf, String nome, String telefone, String data, String hora){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.data = data;
        this.hora =  hora;
    }
}
