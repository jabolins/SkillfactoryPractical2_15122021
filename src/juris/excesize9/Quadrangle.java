package juris.excesize9;

public abstract class Quadrangle {
    int a, b;
    String color;

    public Quadrangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    abstract Double getLargeDiagonal();

    abstract Double getHeight();

    abstract public String getColor();
}
