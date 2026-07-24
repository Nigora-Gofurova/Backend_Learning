package Problem_Solving;

import java.util.Scanner;

public class Task_01 {
    public int countCharacters(String text) {

        text = text.replace(" ", "");

        return text.length();

    }

    public static void main(String[] args) {

        Task_01 myObj = new Task_01();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        int result = myObj.countCharacters(text);

        System.out.println("Number of characters: " + result);
    }
}