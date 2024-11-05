

interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(6);
        System.out.println("Area of Circle: " + circle.getArea());

        Rectangle rectangle = new Rectangle(4, 90);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}



