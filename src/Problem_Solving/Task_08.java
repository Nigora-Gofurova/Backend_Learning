package Problem_Solving;

import java.util.Scanner;

public class Task_08 {
    public void replaceCharacter(String text, char oldChar, char newChar) {

        String result = text.replace(oldChar, newChar);

        System.out.println(result);

    }

    public static void main(String[] args) {

        Task_08 myObj = new Task_08();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        System.out.print("Qaysi harfni almashtirasiz: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Qaysi harfga almashtirasiz: ");
        char newChar = sc.next().charAt(0);

        myObj.replaceCharacter(text, oldChar, newChar);

    }
}
