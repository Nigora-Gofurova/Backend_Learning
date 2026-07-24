package Problem_Solving;

import java.util.Scanner;

public class Task_16 {
    public void countDigits(String text) {

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (Character.isDigit(text.charAt(i))) {

                count++;

            }

        }

        System.out.println(count);

    }

    public static void main(String[] args) {

        Task_16 myObj = new Task_16();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        myObj.countDigits(text);

    }

}
