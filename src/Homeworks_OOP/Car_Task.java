package Homeworks_OOP;

public class Car_Task {
    private String  color;
    private String  modeli;
    private double price;
    private boolean automatKPP;

    public Car_Task( String  color, String modeli, double price, boolean automatKPP ) {
        this.color = color;
        this.modeli = modeli;
        this.price = price;
        this.automatKPP = automatKPP;

    }
    public String setColor() {
        return color;
    }
    public void getColor(String color) {
        this.color = color;
    }
    public String setModeli() {
        return modeli;
    }
    public void getModeli(String modeli) {
        this.modeli = modeli;
    }
    public double setPrice() {
        return price;
    }
    public void getPrice(double price) {
        this.price = price;
    }
    public boolean isAutomatKPP() {
        return automatKPP;
    }
    public void setAutomatKPP(boolean automatKPP) {
        this.automatKPP= automatKPP;
    }
    public void printInfo() {
        String tuzilma = automatKPP ? "Avtomat" : "Mexanik";
        System.out.println(modeli + " Rang: " + color + " Narx: " + price + " Tuzilma: " + tuzilma);
    }
}
