package Problem_Solving;

import java.util.Scanner;

public class Task_09 {
    public int characterFrequency(String text, char letter) {

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == letter) {
                count++;
            }

        }

        return count;

    }

    public static void main(String[] args) {

        Task_09 myObj = new Task_09();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        System.out.print("Qaysi harfni sanaysiz: ");
        char letter = sc.next().charAt(0);

        int result = myObj.characterFrequency(text, letter);

        System.out.println("Soni: " + result);

    }
}
