package oppsPracticeProblem.Inheritance.UniversitySystem;

public class Person {
    protected int personId;
    protected String personName;

    public Person(int id, String name){
        this.personId=id;
        this.personName=name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "PersonId=" + personId +
                "personName=" + personName + '\'' +
                '}';

    }}