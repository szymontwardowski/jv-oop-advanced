package core.basesyntax;

public class Circle extends Figure.Figure {
    private double radius;

    public Circle(String color, double radius) {
        setColor(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
