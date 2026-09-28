package Homework_OOP_04;

import java.util.Arrays;

public class Order {
    private int orderId;
    private Customer customer;
    private Product [] products;
    private String status;

    public Order(int orderId, Customer customer, Product [] products){
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.status = "PENDING";

    }
    public int getOrderId() {
        return orderId;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Product [] getProducts() {
        return products;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("PENDING") || status.equals("PAID")|| status.equals("SHIPPED")) {
            this.status = status;
        }else {
            System.out.println(" xato kiritingiz faqat paid ,panding va shipped bolishi mumkun ");
        }
    }
    public double getTotalPrice(){
        double total=0;
        for(int n=0;n<products.length;n++){
            total=total+products[n].getPrice()*products[n].getQuantity();
        }
        return total;
    }
    public String toString(){
        return "Orderid "+orderId+" customer "+customer+" products "+products;
    }
}
