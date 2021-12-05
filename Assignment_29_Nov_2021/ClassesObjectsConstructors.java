package Assignment_29_Nov_2021;

import java.util.Arrays;

class Vehicle {
    String name;
    String engineNumber;
    float weight;
    int rpm;
    String type;

    static String warrenty = "5 Years";
    static String[] TnC = { "1. Warranty is applicable only on Engine",
            "2. Warranty is applicable only if the vehicle is Serviced regularly",
            "3. Service is for every 90 days or",
            "4. 5000 Kms (whichever comes first)" };

    public String engineOn() {
        return "Engine Started";
    }

    public String engineOff() {
        return "Engine Stopped";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getEngineNumber() {
        return this.engineNumber;
    }

    public float getWeight() {
        return this.weight;
    }

    public int getRpm() {
        return this.rpm;
    }

    public String getType() {
        return this.type;
    }
}

class Bike {
    String model;
    int cc;

    // Default Constructor
    Bike() {
        System.out.println("\n\nDefault constructor for Bike Class\n");
    }

    // Parameterised Constructor
    Bike(String m, int c) {
        System.out.println("\n\nParameterised constructor for Bike Class\n");
        // Setting the values
        model = m;
        cc = c;
    }

    void display() {
        System.out.println(model + " is of " + cc + " cc.");
    }

}

public class ClassesObjectsConstructors {
    public static void main(String[] args) {

        /*
         * We've intialised the variables by creating objects for bike.
         */
        Vehicle bike = new Vehicle();

        bike.name = "Pulsar";
        bike.engineNumber = "ABCD01234P";
        bike.weight = 200;
        bike.rpm = 8500;
        bike.type = "Petrol";

        System.out.println("\n\nProperties of Bike\n");
        System.out.println(bike.name);
        System.out.println(bike.engineNumber);
        System.out.println(bike.weight);
        System.out.println(bike.rpm);
        System.out.println(bike.type);
        System.out.println(Arrays.toString(Vehicle.TnC));

        System.out.println(bike.engineOn());
        System.out.println(bike.engineOff());

        /*
         * We haven't intialised the variables of vehicle and we'll check.
         */

        Vehicle car = new Vehicle();

        System.out.println("\n\nProperties of Car\n");
        System.out.println(car.name);
        System.out.println(car.engineNumber);
        System.out.println(car.weight);
        System.out.println(car.rpm);
        System.out.println(car.type);

        System.out.println(car.engineOn());
        System.out.println(car.engineOff());

        /*
         * We can see in output that all the values which we printed using car object
         * are only default values.
         */

        /*
         * We'll intitalize some values of Trek and We'll leave a few.
         */

        Vehicle trek = new Vehicle();

        trek.weight = 20000;
        trek.rpm = 4000;
        trek.type = "Diesel";

        System.out.println("\n\nProperties of Trek\n");
        System.out.println(trek.name);
        System.out.println(trek.engineNumber);
        System.out.println(trek.weight);
        System.out.println(trek.rpm);
        System.out.println(trek.type);

        System.out.println(trek.engineOn());
        System.out.println(trek.engineOff());

        /*
         * We can see in output that variables which we initialized are printed and
         * which we haven't are default values.
         */

        /*
         * Default Constructor for Class Bike
         */
        Bike b = new Bike();
        b.display();

        /*
         * Parameterised Constructor for Class Bike
         */
        Bike b2 = new Bike("Dominar", 200);
        b2.display();

        /*
         * Getters and Setters
         */

        // Setting Values
        System.out.println("\n\nGetters and Setters\n");
        Vehicle pulsar = new Vehicle();

        pulsar.setName("Pulsar");
        pulsar.setEngineNumber("MHBR12345");
        pulsar.setWeight(200.50f);
        pulsar.setRpm(2000);
        pulsar.setType("Petrol");

        // Getting Values
        System.out.println(pulsar.getName());
        System.out.println(pulsar.getEngineNumber());
        System.out.println(pulsar.getWeight());
        System.out.println(pulsar.getRpm());
        System.out.println(pulsar.getType());
    }
}
