package Problem_Solving;

import java.util.Scanner;


public class Task_03 {
    public int countWords(String text) {

        int count = 1;

        text = text.trim();

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                count++;
            }

        }

        return count;

    }

    public static void main(String[] args) {

        Task_03 myObj = new Task_03();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        int result = myObj.countWords(text);

        System.out.println("Number of words: " + result);

    }
}
