package Array_code_with_definition;

import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nechta element: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {    // takrorlovchi joyi
            System.out.print(i+ " son :");
            arr[i] = input.nextInt();
        }
        int count = 0;

        for (int i = 0; i < arr.length; i++) {  // massivni yana bir bor tekshiradi faqat bu safar sonlarni
            if (arr[i] == 1 || arr[i] == 4) {
                count++;
            }
        }
        if (count == arr.length) {   // massivni 1 yoki 4  ekanligini  tekshiryapti
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
