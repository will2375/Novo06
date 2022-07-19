package FiguraGeometrica;

public class Quadrado implements FiguraGeometrica {

    public double lado;

    @Override
    public double calcularArea() {

        setLado(4);
        System.out.println("Lado do quadrado é " + getLado());
        System.out.println("A area do quadrado é :" + getLado()*getLado());

        return this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
