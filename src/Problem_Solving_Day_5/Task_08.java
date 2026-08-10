package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_08 {
    public void yosh(int age) {

        int on = age / 10;
        int bir = age % 10;

        String onlik = "";
        String birlik = "";

        if (age < 20 || age > 69) {

            System.out.print("xato yosh");

        } else {

            switch (on) {

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
                    onlik = "oltmish";
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
                System.out.print(onlik + " yosh");
            } else {
                System.out.print(onlik + " " + birlik + " yosh");
            }
        }
    }

    public static void main(String[] args) {

        Task_08 obj = new Task_08();

        Scanner input = new Scanner(System.in);

        System.out.print("Yoshni kiriting: ");
        int age = input.nextInt();

        obj.yosh(age);
    }
}
