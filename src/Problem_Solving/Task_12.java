package Problem_Solving;

import java.util.Scanner;

public class Task_12 {
    public void compareStrings(String text1, String text2) {

        if (text1.equals(text2)) {

            System.out.println("Strings are equal.");

        } else {

            System.out.println("Strings are not equal.");

        }

    }

    public static void main(String[] args) {

        Task_12 myObj = new Task_12();

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinchi matnni kiriting: ");
        String text1 = sc.nextLine();

        System.out.print("Ikkinchi matnni kiriting: ");
        String text2 = sc.nextLine();

        myObj.compareStrings(text1, text2);

    }

}
