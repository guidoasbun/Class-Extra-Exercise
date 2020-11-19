public class Car {
    private String make, model, color;
    private double price, speed;
    private int year;

    public Car(){
        make = "N/A";
        model = "N/A";
        color = "N/A";
        price = 0;
        speed = 0;
        year = 0;
    }

    public Car(String newMake, String newModel, String newColor, double newPrice, double newSpeed, int newYear){
        make = newMake;
        model = newModel;
        color = newColor;
        price = newPrice;
        speed = newSpeed;
        year = newYear;
    }

    public void accel(double newAccel){
        speed += newAccel;
    }

    public void displayFeatures(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Speed: " + speed + " mph");
        System.out.println();
    }

    public void brake(){
        speed = 0;
    }

    public void setMake(String newMake){
        make = newMake;
    }
    public void setModel(String newModel){
        model = newModel;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public void setPrice(double newPrice){
        price = newPrice;
    }
    public void setSpeed(double newSpeed){
        speed = newSpeed;
    }
    public void setYear(int newYear){
        year = newYear;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public double getSpeed(){
        return speed;
    }
    public int getYear(){
        return year;
    }
}
