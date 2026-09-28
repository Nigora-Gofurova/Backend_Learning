package Homework_OOP_04;

public class Main_class {
    public static void main(String[] args) {


        System.out.println("---------------------PRODUCT ====================");

        Product product = new Product("telefon", 100000, 3);
        System.out.println(product);   // toString() avtomatik chaqiriladi

        // Getterlarni sinaymiz shart ishlayaptimi yomi
        System.out.println("Nomi: " + product.getName());
        System.out.println("Narxi: " + product.getPrice());
        System.out.println("Miqdori: " + product.getQuantity());

        // Setterlarni sinaymiz bu yerda ham
        product.setPrice(900000);
        System.out.println("Yangi narxi: " + product.getPrice());

        product.setQuantity(2);
        System.out.println("Yangi miqdori: " + product.getQuantity());

        // Validatsiyani sinaymiz shartimizni tori ishlayotganini bilish uchun
        Product product2 = new Product("noutbuk", -1000, 2);
        System.out.println(product2);

        product2.setQuantity(-5);
        System.out.println(product2);


        System.out.println();
        System.out.println("------------------------- ADDRESS ====================");

        Address address = new Address("Uzbekistan", "Andijon", "Bobur ko'chasi", "1000");
        System.out.println(address);

        // Validatsiya
        address.setZipCode("12");       // xato chiqishi kere chunki qisqa
        System.out.println("Indeks o'zgarmadi: " + address.getZipCode());



        System.out.println();
        System.out.println("---------------------- CUSTOMER ====================");

        Customer customer = new Customer("Muhammadali", "muhammadali@mail.com", "998901234567", address);
        System.out.println(customer);

        // Validatsiya  @ agar sgu belgi bolmasa hato berishi kere
        customer.setEmail("noto'g'ri-email");   // xato chiqadi
        System.out.println("Email o'zgarmadi: " + customer.getEmail());



        System.out.println();
        System.out.println("--------------------- PAYMENT CARD ====================");

        PaymentCard card = new PaymentCard("1234567812345678", "09.28", "206");
        System.out.println(card);   // faqat oxirgi 4 ta raqam ko'rinadi

        // Validatsiya CVV noto'g'ri chunki 3 talik son bolish kere
        card.setCvv("12");          // xato chiqadi



        System.out.println();
        System.out.println("------------------------ORDER ====================");

        Product[] products = new Product[3];
        products[0] = new Product("Banan", 15000, 5);
        products[1] = new Product("Olma", 10000, 3);
        products[2] = new Product("Kivi", 25000, 2);

        Order order = new Order(1, customer, products);
        System.out.println(order);

        // Statusni sinaymiz
        order.setStatus("PAID");         // to'g'ri, o'zgaradi
        System.out.println("Status: " + order.getStatus());

        order.setStatus("DELIVERED");    // noto'g'ri, xato chiqadi
        System.out.println("Status o'zgarmadi: " + order.getStatus());



    }
}