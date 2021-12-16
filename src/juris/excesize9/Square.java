package juris.excesize9;

public class Square extends Quadrangle implements Figure{
    public Square(int a, String color) {
        super(a, a, color);
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return a*4;
    }

    @Override
    Double getLargeDiagonal() {
        return Math.sqrt((a*a)+(a*a));
    }

    @Override
    Double getHeight() {
        return Double.valueOf(a);
    }

    @Override
    public String getColor() {
        return color;
    }
}
