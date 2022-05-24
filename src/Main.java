/*
Annotations 01
Exercise: Annotations 1

define a tester class where you:
create a Car object
call both methods, suppressing deprecation warnings
 */
@SuppressWarnings(value = "deprecation")
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Ferrari", 58000);

        System.out.println("Deprecated method: ");
        car.printCarDetails();

        System.out.println();

        System.out.println("Not deprecated method: ");
        car.getCarDetails();
    }
}
