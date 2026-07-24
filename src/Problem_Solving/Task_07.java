package Problem_Solving;

import java.util.Scanner;

public class Task_07 {
    public void lowerCase(String text) {

        String result = text.toLowerCase();

        System.out.println(result);

    }

    public static void main(String[] args) {

        Task_07 myObj = new Task_07();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        myObj.lowerCase(text);

    }

}
