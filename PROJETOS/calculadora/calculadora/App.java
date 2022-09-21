package calculadora;

public class App {
    public static void main(String[] args) {
        Circulo c1=new Circulo(4);
        Quadrado q1=new Quadrado(2);
        Processos process=new Processos();
        System.out.format("\n\nÁrea do circulo: %f \nPerimetro do circulo: %f", c1.calcularArea(), c1.calcularPerimetro());
        System.out.format("\n\nÁrea do quadrado: %f \nPerimetro do circulo: %f", q1.calcularArea(), q1.calcularPerimetro());
        System.out.format("\n\nSoma das áreas anterioes: %f", process.somarAreas(c1, q1));
        System.out.format("\n\nSoma dos Perimetros anterioes: %f", process.somarPerimetros(c1, q1));
    }
}
