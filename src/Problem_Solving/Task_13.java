package Problem_Solving;

import java.util.Scanner;

public class Task_13 {
    public void firstLastLetter(String text) {

        char first = text.charAt(0);

        char last = text.charAt(text.length() - 1);

        System.out.println("First: " + first);
        System.out.println("Last: " + last);

    }

    public static void main(String[] args) {

        Task_13 myObj = new Task_13();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        myObj.firstLastLetter(text);

        sc.close();

    }
}
