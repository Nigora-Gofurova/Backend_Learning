package Problem_Solving;

import java.util.Scanner;

public class Task_17 {
    public void removeDigits(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char belgi = text.charAt(i);

            if (belgi < '0' || belgi > '9') {

                result = result + belgi;

            }

        }

        System.out.println(result);

    }

    public static void main(String[] args) {

        Task_17 myObj = new Task_17();

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");
        String text = sc.nextLine();

        myObj.removeDigits(text);

    }
}
