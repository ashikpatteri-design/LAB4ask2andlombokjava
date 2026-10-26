public class Main {
    public static void main(String[] args) {


        Car myCar = new Car("Corolla", "Toyota", 2022, 20000.0, "white", 5);


        System.out.println(myCar.toString());


        myCar.sell();


        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: " + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());


        myCar.setColor("red");
        myCar.setPrice(18500.0);
        myCar.setYear(2023);


        System.out.println(myCar.toString());
    }
}
