package Method;

import java.util.Scanner;

public class Task_14 {
    public double vaqt(double s) {

        return s / 7;
    }

    public static void main(String[] args) {

        Task_14 myObj = new Task_14();

        Scanner sc = new Scanner(System.in);

        System.out.print("Masofani kiriting: ");
        double s = sc.nextDouble();

        System.out.println(myObj.vaqt(s));
    }
}
