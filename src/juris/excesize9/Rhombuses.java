package juris.excesize9;

public class Rhombuses extends Quadrangle implements Figure{
    Double alpha;
    Double beta;

    public Rhombuses(int a, Double alpha, Double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    Double getLargeDiagonal() {
        return null;
    }

    @Override
    Double getHeight() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }
}
