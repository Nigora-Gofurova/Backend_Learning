package Homework_OOP_04;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        setPrice(price);
        setQuantity(quantity);

    }
public String getName() {

        return name;
}
public double getPrice() {

        return price;
}
public int getQuantity() {

        return quantity;
}
public void setPrice(double price) {
        if (price < 0) {
            System.out.println("xato chuniki manfiy raqam kirita olmaysiz...!!!!");
            this. price = 0;
        }else {
            this.price = price;

        }
}
public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("miqdor manfiyga teng bololmiydi...!!!!");
            this. quantity = 0;
        }else{
            this.quantity = quantity;
        }
}
public String toString() {
        return" Product name "+name+" price "+price+" quantity "+quantity;
}

}
