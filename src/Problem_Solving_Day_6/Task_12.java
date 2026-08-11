package Problem_Solving_Day_6;

import java.util.Scanner;

public class Task_12 {
    public void konfet(double narx) {

        for (double kg = 1.1; kg <= 2; kg = kg + 0.1) {

            System.out.println(kg + " kg = " + narx * kg);
        }
    }

    public static void main(String[] args) {

        Task_12 obj = new Task_12();

       Scanner input = new Scanner(System.in);

        System.out.print("1 kg narxini kiriting: ");
        double narx = input.nextDouble();

        obj.konfet(narx);
    }
}
