package Method;

import java.util.Scanner;

public class Task_16 {
    public double vaqt(double gb) {

        double kb = gb * 1024 * 1024;

        return kb / 750;
    }

    public static void main(String[] args) {

        Task_16 myObj = new Task_16();

        Scanner sc = new Scanner(System.in);

        System.out.print("GB = ");
        double gb = sc.nextDouble();
    }
}
