
public class Processos {
    
    public double somarAreas(FormaGeometrica A, FormaGeometrica B){
        return(A.calcularArea() + B.calcularArea());
    }
    public double somarPerimetros(FormaGeometrica A, FormaGeometrica B){
        return(A.calcularPerimetro() + B.calcularPerimetro());
    }
}
