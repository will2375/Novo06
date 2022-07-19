package FiguraGeometrica;

public class Triangulo implements FiguraGeometrica {

    double base;
    double altura;

    @Override
    public double calcularArea() {

        setAltura(6);
        setBase(9);
        System.out.println("\nA base do triangulo é " + getBase() + " A altura do triangulo é " + getAltura());
        System.out.println("A area do triangulo é " + (getBase()*getAltura())/2);

        return base * altura / 2;
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
