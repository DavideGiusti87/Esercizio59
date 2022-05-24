/*
Annotations 01
Exercise: Annotations 1

define a class Car that has:
2 instance variables modelName and mileage
a constructor that takes 2 params and assign them to the instance variables
a deprecated method (use an annotation to highlight it) printCarDetails() that:
prints on one line the car details
a new method called getCarDetails() that:
prints on multiple lines the car details
 */

public class Car {
    private String modelName;
    private int mileage;


    public Car(String modelName, int mileage) {
        setModelName(modelName);
        setMileage(mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    /**
     * @deprecated The method getCarDetails() is a better choice,as the printout is better formatted.
     */
    @Deprecated
    public void printCarDetails() {
        System.out.println(toString());
    }

    /**
     * To print the machine details
     */
    public void getCarDetails() {
        System.out.printf(
                "~ DETAILS CAR ~%n" +
                        "* Model name: %s%n" +
                        "* Milage: %d%n",
                modelName, mileage
        );
    }


    private String getModelName() {
        return modelName;
    }

    private void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private int getMileage() {
        return mileage;
    }

    private void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
