package Problem_Solving;

import java.util.Scanner;

public class Task_20 {
    public void countLetters(String text) {

        int upper = 0;
        int lower = 0;

        for (int i = 0; i < text.length(); i++) {

            char belgi = text.charAt(i);

            if (Character.isUpperCase(belgi)) {

                upper++;

            } else if (Character.isLowerCase(belgi)) {

                lower++;

            }

        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

    }

    public static void main(String[] args) {

        Task_20 myObj = new Task_20();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        myObj.countLetters(text);

    }
}
