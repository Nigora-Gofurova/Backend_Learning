package Homeworks_OOP;

public class Main_Run_Task {
    public static void main(String[] args) {
        Car_Task car1 = new Car_Task("Qora", "Chevrolet Cobalt", 150000000, true);
        Car_Task car2 = new Car_Task("Oq", "Chevrolet Nexia", 90000000, false);

        car1.printInfo();
        car2.printInfo();


        car1.setColor();
        System.out.println("\nRang o'zgartirilgandan keyin:");
        car1.printInfo();

        System.out.println("------------------------------------------------------------------------------");

        Uchburchak_Task uchburchak = new Uchburchak_Task(3, 4);

        System.out.println("\nKatet a: " + uchburchak.getA());
        System.out.println("Katet b: " + uchburchak.getB());
        System.out.println("Gipotenuza c: " + uchburchak.getC());
        System.out.println("Yuzi: " + uchburchak.getYuzi());
        System.out.println("Perimetri: " + uchburchak.getPeremetr());

        System.out.println("------------------------------------------------------------------------------");

        Person_Task personTask = new Person_Task();
        Person_Task.Person p1 = personTask.new Person("Aziz", "Karimov", 2000, "erkak", "muhandis");

        System.out.println(p1);

        p1.kasbniOzgartir("dasturchi");

        System.out.println(p1);
    }
    }





