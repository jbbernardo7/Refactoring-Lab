package com.bmcl.refactoring.example2;

public class Circle extends Shape {
    private double radius; // ONLY FOR CIRCLES

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getArea() throws Exception {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() throws Exception {
        return 2 * Math.PI * radius;
    }

    public void draw(GraphicFramework graphics) {
        graphics.drawCircle(x, y, radius);
    }
}
