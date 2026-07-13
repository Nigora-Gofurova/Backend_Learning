package Method;

import java.util.Scanner;

public class Task_02 {
    public double metrgaOtqaz(double L) {
        return L / 100;
    }

    public static void main(String[] args) {

        Task_02 myObj = new Task_02();

        Scanner sc = new Scanner(System.in);

        System.out.print("L = ");
        double L = sc.nextDouble();

        System.out.println(myObj.metrgaOtqaz(L));
    }
}
