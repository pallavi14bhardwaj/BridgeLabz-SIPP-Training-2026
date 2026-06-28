package oppsPracticeProblem.EncapsulationAndAbstraction.ShapeHierarchy;


public class Rectangle extends Shape {

    private int length;
    private int breadth;

    Rectangle r;

    public void setLength(int length) { //setter
        this.length = length;
    }

    public void setBreadth(int breadth) { //setter
        this.breadth = breadth;
    }

    @Override
    public void area() {
        r = new Rectangle();
        System.out.println("Area of Rectangle: "+r.length*r.breadth);
    }

    @Override
    public void perimeter() {
        r = new Rectangle();
        System.out.println("Perimeter of Rectangle: "+ 2*(r.length+r.breadth));
    }
}