package core.basesyntax;

public class RightTriangle extends Figure {
    private final double base;
    private final double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    @Override
    public String toString() {
        return "RightTriangle with base: " + base + ", height: " + height + ", color: " + getColor();
    }
}
