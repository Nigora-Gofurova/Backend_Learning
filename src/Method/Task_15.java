package Method;

import java.util.Scanner;

public class Task_15 {
    public int soat(int a, int b) {

        return (a * 7 + b) * 24;
    }

    public static void main(String[] args) {

        Task_15 myObj = new Task_15();

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.println(myObj.soat(a, b));
    }
}
