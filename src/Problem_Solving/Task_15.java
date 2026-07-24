package Problem_Solving;

import java.util.Scanner;

public class Task_15 {
    public void findSubstring(String text, String word) {

        if (text.contains(word)) {

            System.out.println("Found");

        } else {

            System.out.println("Not Found");

        }

    }

    public static void main(String[] args) {

        Task_15 myObj = new Task_15();

        Scanner sc = new Scanner(System.in);

        System.out.print("Asosiy matnni kiriting: ");
        String text = sc.nextLine();

        System.out.print("Qidiriladigan matnni kiriting: ");
        String word = sc.nextLine();

        myObj.findSubstring(text, word);

    }
}
