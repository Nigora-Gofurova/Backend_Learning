package Problem_Solving;

import java.util.Scanner;

public class Task_10 {
    public void removeSpaces(String text) {

        String result = text.replace(" ", "");

        System.out.println(result);

    }

    public static void main(String[] args) {

        Task_10 myObj = new Task_10();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        myObj.removeSpaces(text);

    }
}
