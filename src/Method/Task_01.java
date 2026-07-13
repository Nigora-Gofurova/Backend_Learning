package Method;

import java.util.Scanner;

public class Task_01 {
    public double aniDarajasi(double a) {

        double a2 = a * a;
        double a4 = a2 * a2;
        double a6 = a4 * a2;
        double a7 = a6 * a;

        return a7;
    }

    public static void main(String[] args) {

        Task_01 myObj = new Task_01();

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.println(myObj.aniDarajasi(a));
    }
}

