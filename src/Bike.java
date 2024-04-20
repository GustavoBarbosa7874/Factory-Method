import javax.swing.*;

public class Bike implements IFactory {
    private String color;

     public Bike() {}

    public Bike(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void create(int quantity) {
        System.out.println("Create " + quantity + " Bikes");
    }
}