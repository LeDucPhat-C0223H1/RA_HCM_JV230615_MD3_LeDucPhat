package BT4;

import BT1.Resizeable;

public class Square extends Shape implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }
}
