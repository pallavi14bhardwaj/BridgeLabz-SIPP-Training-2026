package oppsPracticeProblem.JavaClassAndObject.level1.HandleMobilePhoneDetails;
public class MobilePhoneDemo {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();

        phone.brand = "Samsung";
        phone.model = "Galaxy S24";
        phone.price = 79999;

        phone.displayDetails();
    }
}