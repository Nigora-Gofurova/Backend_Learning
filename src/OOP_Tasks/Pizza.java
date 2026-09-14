package OOP_Tasks;

public class Pizza {

    private String  size;
    private String [] toppings;
    private boolean vegetarian;
    private double price;
    private boolean sauce;
    private String  xamirTuri;

    public Pizza(String size,String[] toppings,boolean veg,boolean sauce,String  xamirTuri) {

        this.size = size;
        this.toppings = toppings;
        this.vegetarian = veg;
        this.price = 100000;
        this.sauce = sauce;
        this.xamirTuri = xamirTuri;

    }
    public double getPrice() {

        double totalPrice=price;
        totalPrice += toppings.length*4000;
        if(size.equals("L")) totalPrice+=14000;
        else if(size.equals("M")) totalPrice+=12000;
        else if(size.equals("S")) totalPrice+=8000;

        return totalPrice;
    }
}
