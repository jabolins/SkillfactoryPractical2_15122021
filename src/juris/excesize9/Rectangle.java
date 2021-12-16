package juris.excesize9;

public class Rectangle extends Quadrangle implements Figure{
    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }

    @Override
    Double getLargeDiagonal() {
        return Math.sqrt((a*a)+(b*b));
    }

    @Override
    Double getHeight() {
        if (a<b){
            return Double.valueOf(a);
        }
        else return Double.valueOf(b);
    }

    @Override
    public String getColor() {
        return color;
    }
}
