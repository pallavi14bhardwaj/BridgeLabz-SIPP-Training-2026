package oppsPracticeProblem.JavaClassAndObject.level1.AreaofCircle;
public class CircleDemo {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius = 7;

        System.out.println("Area = " + c.calculateArea());
        System.out.println("Circumference = " +
                c.calculateCircumference());
    }
}