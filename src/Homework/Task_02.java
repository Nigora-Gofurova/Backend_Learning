package Homework;

import java.util.Scanner;

public class  Task_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bo'yingizni kiriting :");
        double boy = input.nextDouble();

        System.out.print("Vazningizni kiriting (kg) :");
        double vazn = input.nextDouble();

        double bmi = vazn / (boy * boy);

        if (bmi < 18.5) {
            System.out.print("Ozginsiz");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.print("Normal holatdasiz");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.print("Ortiqcha vazningiz bor");
        } else {
            System.out.print("Semizlik");
        }
    }

}
