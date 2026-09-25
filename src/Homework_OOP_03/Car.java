package Homework_OOP_03;

public class Car {
    private String color;
    private String model;
    private double price;
    private boolean automatKPP;

    public Car(String color, String model, double price, boolean automatKPP) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.automatKPP = automatKPP;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAutomatKPP() {
        return automatKPP;
    }

    public void setAutomatKPP(boolean automatKPP) {
        this.automatKPP = automatKPP;
    }

    public void printInfo() {
        String tuzilma = automatKPP ? "Avtomat" : "Mexanik";
        System.out.println("Model: " + model + " | Rang: " + color + " | Narx: " + price + " | Tizim: " + tuzilma);
    }
}
