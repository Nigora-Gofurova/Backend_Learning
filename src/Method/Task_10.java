package Method;

import java.util.Scanner;

public class Task_10 {
    public void almashtir(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        Task_10 myObj = new Task_10();

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        myObj.almashtir(a, b);
    }
}
