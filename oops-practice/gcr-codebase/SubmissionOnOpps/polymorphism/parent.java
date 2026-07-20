package oppsPracticeProblem.polymorphism;

class Parent {

    void add() {
        System.out.println("hi i am parent");
    }
}
class Child extends Parent {

    @Override
    void add() {
        System.out.println("hi i am child");
    }

    public static void main(String[] args) {

        Parent obj = new Child();
        obj.add();

    }
}