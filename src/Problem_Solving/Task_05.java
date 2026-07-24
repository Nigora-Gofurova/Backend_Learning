package Problem_Solving;

import java.util.Scanner;

public class Task_05 {
    public void palindrome(String text) {

        String teskari = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            teskari = teskari + text.charAt(i);

        }

        if (text.equals(teskari)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

    public static void main(String[] args) {

        Task_05 myObj = new Task_05();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.nextLine();

        myObj.palindrome(text);

    }

}
