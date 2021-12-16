package juris.excesize6;

public class Vector2D extends Vector{


    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1,0, x2, y2,0);

    }

    @Override
   public double getLength() {
        return Math.sqrt((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1));

    }

    @Override
    public String getVectorCords() {
        return (x2-x1) + ","+ (y2-y1);
    }

    Double getscalarProduct(Vector2D vector){
        return Double.valueOf(0);
    }

    Double getAngle(Vector2D vector){
        return Double.valueOf(0);
    }
}
