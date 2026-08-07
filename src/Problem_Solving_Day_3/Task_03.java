package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_03 {
    public void countNumbers(int a, int b, int c, int d, int e) {

        int musbat = 0;
        int manfiy = 0;
        int nol = 0;

        if (a > 0)
            musbat++;
        else if (a < 0)
            manfiy++;
        else
            nol++;

        if (b > 0)
            musbat++;
        else if (b < 0)
            manfiy++;
        else
            nol++;

        if (c > 0)
            musbat++;
        else if (c < 0)
            manfiy++;
        else
            nol++;

        if (d > 0)
            musbat++;
        else if (d < 0)
            manfiy++;
        else
            nol++;

        if (e > 0)
            musbat++;
        else if (e < 0)
            manfiy++;
        else
            nol++;

        System.out.println("Musbat: " + musbat);
        System.out.println("Manfiy: " + manfiy);
        System.out.println("Nol: " + nol);

    }

    public static void main(String[] args) {

        Task_03 myObj = new Task_03();

       Scanner input = new Scanner(System.in);

        System.out.print("1-son: ");
        int a = input.nextInt();

        System.out.print("2-son: ");
        int b = input.nextInt();

        System.out.print("3-son: ");
        int c = input.nextInt();

        System.out.print("4-son: ");
        int d = input.nextInt();

        System.out.print("5-son: ");
        int e = input.nextInt();

        myObj.countNumbers(a, b, c, d, e);

    }
}
