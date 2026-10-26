public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void delivery() {
        quantity++;
        System.out.println("Delivery arrived! Cars in stock: " + quantity);
    }

    public void sell() {
        if (quantity > 0) {
            quantity--;
            System.out.println("Car sold! Cars left: " + quantity);
        } else {
            System.out.println("Sorry, no cars left to sell!");
        }
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "', model='" + model + "', year=" + year
                + ", price=" + price + ", color='" + color + "', quantity=" + quantity + "}";
    }
}