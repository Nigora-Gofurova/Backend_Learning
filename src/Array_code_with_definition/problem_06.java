package Array_code_with_definition;

import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nechta element kiritasiz :");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i +  " son :");
            arr[i] = input.nextInt();
        }
        int sum = 0; // yigindi saqlab oladi

        for (int i = 0; i < arr.length; i++) {      // Birinchi elementdan kichik sonlarni toplash
            if (arr[i] < arr[0]) {      // massivni  sonini arr[i] birinchi son arr[0] kichik yoki kattaligini  tekshiradi
                sum += arr[i];
            }
        }
        System.out.println("Yig'indi = " + sum);        //output

    }
}
