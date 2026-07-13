package Method;

import java.util.Scanner;

public class Task_09 {
    public void vaqt(int n) {

        int soat = n / 3600;
        int minut = (n % 3600) / 60;

        System.out.println(soat + " soat");
        System.out.println(minut + " minut");
    }

    public static void main(String[] args) {

        Task_09 myObj = new Task_09();

        Scanner sc = new Scanner(System.in);

        System.out.print("Sekundni kiriting: ");
        int n = sc.nextInt();

        myObj.vaqt(n);
    }
}