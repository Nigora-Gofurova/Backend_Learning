package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_02 {
    public void Age(int age) {

        int on = age / 10;
        int bir = age % 10;

        String onlik = "";
        String birlik = "";

        if (age < 10 || age > 60) {
            System.out.print("hato age");
        } else {

            switch (on) {
                case 1:
                    onlik = "o'n";
                    break;
                case 2:
                    onlik = "yigirma";
                    break;
                case 3:
                    onlik = "ottiz";
                    break;
                case 4:
                    onlik = "qirq";
                    break;
                case 5:
                    onlik = "ellik";
                    break;
                case 6:
                    onlik = "olmish";
                    break;
            }
            switch (bir) {
                case 1:
                    birlik = "bir";
                    break;
                case 2:
                    birlik = "ikki";
                    break;
                case 3:
                    birlik = "uch";
                    break;
                case 4:
                    birlik = "tort";
                    break;
                case 5:
                    birlik = "besh";
                    break;
                case 6:
                    birlik = "olti";
                    break;
                case 7:
                    birlik = "yetti";
                    break;
                case 8:
                    birlik = "sakkiz";
                    break;
                case 9:
                    birlik = "toqqiz";
                    break;
            }
            if (bir == 0) {
                System.out.print(onlik);
            } else {
                System.out.print(onlik + " " + birlik + " yosh");
            }
        }
    }
    public static void main(String[] args) {

        Task_02 obj = new Task_02();

        Scanner input = new Scanner(System.in);

        System.out.print("yoshni kiriting :");
        int age = input.nextInt();

        obj.Age(age);
    }
}

