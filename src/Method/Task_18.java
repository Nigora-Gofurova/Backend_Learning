package Method;

import java.util.Scanner;

public class Task_18 {
    public void vaqt(int n) {

        int kun = n / 86400;

        int qoldiq = n % 86400;

        int soat = qoldiq / 3600;

        qoldiq = qoldiq % 3600;

        int minut = qoldiq / 60;

        int sekund = qoldiq % 60;

        System.out.println(kun + " kun");
        System.out.println(soat + " soat");
        System.out.println(minut + " minut");
        System.out.println(sekund + " sekund");
    }

    public static void main(String[] args) {

        Task_18 myObj = new Task_18();

        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int n = sc.nextInt();

        myObj.vaqt(n);
    }
}
