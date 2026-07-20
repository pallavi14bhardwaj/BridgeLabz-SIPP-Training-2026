package oppsPracticeProblem.EncapsulationAndAbstraction.ShapeHierarchy;

public class Triangle extends Shape {

    private int base;
    private int height;

    private int length1;
    private int length2;

    Triangle t;

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public void setLength2(int length2) {
        this.length2 = length2;
    }

    @Override
    public void area(){
        t = new Triangle();
        System.out.println("Area of Triangle: " +(1/2)*base*height);
    }

    @Override
    public void perimeter() {
        t = new Triangle();
        System.out.println("Perimeter of Triangle: " +t.base+t.length1+t.length2);
    }
}