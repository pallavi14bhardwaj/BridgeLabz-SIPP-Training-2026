class Ravi
{
    string name; //global variable : not initial
    int age;
    string rank;
    double salary;
    float fees;

    public Ravi(string name, int age, string rank, double salary, float fees){
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.salary = salary;
        this.fees = fees;

    }

    public static void main(String[] args){
        Ravi r = new Ravi("Sahil",18,"intermidate",180000.00,12345f);
        Ravi r2 = new Ravi();

    }
}