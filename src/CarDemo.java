import java.lang.ref.Reference;

public class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car("Tesla", "Model X", "Red", 35999.0, 0.0, 2021);

        Car car2 = new Car();
        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setColor("Black");
        car2.setYear(2018);
        car2.setPrice(17999.0);
        car2.setSpeed(0.0);

        System.out.println("************ Car 1 ************");
        car1.displayFeatures();

        System.out.println("************ Car 2 ************");
        car2.displayFeatures();
//        System.out.println("Make: " + car2.getMake());
//        System.out.println("Model: " + car2.getModel());
//        System.out.println("Color: " + car2.getColor());
//        System.out.println("Year: " + car2.getYear());
//        System.out.println("Price: $" + car2.getPrice());
//        System.out.println("Speed: " + car2.getSpeed() + " mph");
//        System.out.println();

        System.out.println("************ Invoking getColor() method ************");
        System.out.println("The color of the first car is " + car1.getColor() +
                "and the color of the second car is " + car2.getColor());
        System.out.println();

        System.out.println("************ Invoking methods in Car class ************");
        car1.accel(65.0);
        System.out.println("The first car is going with speed of " + car1.getSpeed() + " mph");
        car1.brake();
        System.out.println("After hitting the brake the speed of the first car is " + car1.getSpeed() + " mph");
        System.out.println();

        System.out.println("************ Reference Variables ************");
        Car car3 = car2;
        System.out.println("The color of the second car is " + car2.getColor());
        System.out.println("The color of the third car is " + car3.getColor());

    }
}
