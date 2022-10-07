package calculadora;

public class Quadrado implements FormaGeometrica {
    private int lado;
    
    public double calcularArea(){
        return(Math.pow(lado, 2));
    }
    public double calcularPerimetro(){
        return(lado * 4);
    }
    public Quadrado(int lado){
        this.lado=lado;
    }
}
