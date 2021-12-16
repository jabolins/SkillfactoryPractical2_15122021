package juris.excesize7;

public class Car extends Transport {
    int maxPassengers;

    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    boolean canMove(int n) {
        if (fuel >=n) {
            fuel -= n;
            return true;
        } else {
            return false;
        }
    }

    @Override
    int getFuelLevel() {
        return fuel;
    }
}
