package oppsPracticeProblem.EncapsulationAndAbstraction.ShapeHierarchy;

public class Circle extends Shape{

    private float radius;
    final double pi = 3.141;

    Circle c;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        c = new Circle();
        System.out.println("Area of Circle: " +pi*radius*radius);
    }

    @Override
    public void perimeter() {
        c = new Circle();
        System.out.println("Perimeter of Circle: "+2*pi*radius);
    }
}