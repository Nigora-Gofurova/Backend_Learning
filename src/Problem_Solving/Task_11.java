package Problem_Solving;

import java.util.Scanner;

public class Task_11 {

    public int findLength(String text) {

        return text.length();

    }

    public static void main(String[] args) {

        Task_11 myObj = new Task_11();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        int result = myObj.findLength(text);

        System.out.println(result);

    }
}
