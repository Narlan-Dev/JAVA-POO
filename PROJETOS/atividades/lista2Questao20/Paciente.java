package lista2Questao20;

public abstract class Paciente {
    private String cpf;
    private String nome;
    private String telefone;
    
    public String getCpf(){return this.cpf;}
    public String getNome(){return this.nome;}
    public String getTelefone(){return this.telefone;}
    public Paciente(String cpf, String nome, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }
}
