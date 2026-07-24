package Problem_Solving;

import java.util.Scanner;

public class Task_19 {
    public void toggleCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char belgi = text.charAt(i);

            if (Character.isUpperCase(belgi)) {

                result = result + Character.toLowerCase(belgi);

            } else if (Character.isLowerCase(belgi)) {

                result = result + Character.toUpperCase(belgi);

            } else {

                result = result + belgi;

            }

        }

        System.out.println(result);

    }

    public static void main(String[] args) {

        Task_19 myObj = new Task_19();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        myObj.toggleCase(text);

    }
}
