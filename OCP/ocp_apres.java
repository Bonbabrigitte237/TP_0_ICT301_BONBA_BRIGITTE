package ict301.solid.ocp;
// Solution : Utilisation d'une interface
interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double width, height;
    public double calculateArea() { return width * height; }
}

class Circle implements Shape {
    double radius;
    public double calculateArea() { return Math.PI * radius * radius; }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}