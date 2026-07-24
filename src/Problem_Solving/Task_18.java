package Problem_Solving;

import java.util.Scanner;

public class Task_18 {
    public void longestWord(String text) {

        String[] words = text.split(" ");

        String longest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > longest.length()) {

                longest = words[i];

            }

        }

        System.out.println(longest);

    }

    public static void main(String[] args) {

        Task_18 myObj = new Task_18();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        myObj.longestWord(text);


    }

}
