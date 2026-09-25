package Homework_OOP_03;

public class Main_class_01 {
    public static void main(String[] args) {

        // --------- car------------
        System.out.println("========================= Car ======================");
        Car car = new Car("Qora", "Chevrolet Cobalt", 150000000, true);
        car.printInfo();


        // ----------- Uchburchak --------------
        System.out.println("\n============================ Uchburchak ==========================");
        Uchburchak_Task uch = new Uchburchak_Task(3, 4);

        System.out.println("Gipotenuza: " + uch.getC());
        System.out.println("Yuzi (parametrsiz): " + uch.getYuzi());
        System.out.println("Yuzi (int koef=2): " + uch.getYuzi(2));
        System.out.println("Yuzi (double koef=1.5): " + uch.getYuzi(1.5));
        System.out.println("Yuzi (long koef=3L): " + uch.getYuzi(3L));
        System.out.println("Perimetri: " + uch.getPeremetr());


        // ---------- Point --------------
        System.out.println("\n================== Point =====================");
        Point p1 = new Point(1, 2, 3);
        p1.printInfo();

        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());
        System.out.println("Z: " + p1.getZ());
    }
}