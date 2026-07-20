package oppsPracticeProblem.JavaClassAndObject.level1.AreaofCircle;
class Circle {
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}