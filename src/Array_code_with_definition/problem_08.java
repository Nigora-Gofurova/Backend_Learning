package Array_code_with_definition;

import java.util.Scanner;

public class problem_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nechta element: ");
        int n = input.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];

        System.out.println("1-massivni kiriting :");

        for (int i = 0; i < array1.length; i++) { // 1user kiritgan son
            System.out.print(i + " son: ");
            array1[i] = input.nextInt();
        }
        System.out.println("2-massivni kiriting :");

        for (int i = 0; i < array2.length; i++) {     // 2 user kiritgan son
            System.out.print(i +  " son: ");
            array2[i] = input.nextInt();
        }
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] - array2[i];  //  birinchi ikkinchi massivni bir index lari bolsa birinchi ayrip uchinchisiniga saqledi
        }
        System.out.println("Yangi massiv:");

        for (int i = 0; i < array3.length; i++) {  // yangi massiv uchun  har bitta  element  bittadan chiqarish uchun
            System.out.print(array3[i] + " ");
        }
    }
}
