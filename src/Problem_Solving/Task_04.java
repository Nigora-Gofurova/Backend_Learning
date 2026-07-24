package Problem_Solving;

import String_N.Task_01;
import java.util.Scanner;

public class Task_04 {
    public String reverseText(String text) {

        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            result = result + text.charAt(i);

        }

        return result;

    }

    public static void main(String[] args) {

        Task_04 myObj = new Task_04();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String result = myObj.reverseText(text);

        System.out.println("Reverse text: " + result);

    }
}
