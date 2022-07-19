package FiguraGeometrica;

public class Retangulo implements FiguraGeometrica {

    double base;
    double altura;


    @Override

    public double calcularArea() {

        setAltura(5);
        setBase(8);
        System.out.println("\nA base do retangulo é " + getBase() + " ,A altura é de " + getAltura());
        System.out.println("A area do retangulo é de " + getBase()*getAltura());
        return this.base * this.altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
