package Problem_Solving;

import java.util.Scanner;

public class Task_06 {
    public void upperCase(String text) {
        String result = text.toUpperCase();
        System.out.println(result);
    }

    public static void main(String[] args) {

        Task_06 myObj = new Task_06();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        myObj.upperCase(text);
    }
}
