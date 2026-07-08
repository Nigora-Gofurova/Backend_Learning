package Java_Tasks;

import java.util.Scanner;

public class Task_01 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] massiv = {10, 25, 47, 63, 89};

        System.out.print("Topish kerak : ");
        int son = input.nextInt();

        int i;

        for (i = 0; i < massiv.length; i++) {

            if (massiv[i] == son) {
                System.out.println("Indeks : " + i);
                break;
            }
        }

        if (i == massiv.length) {
            System.out.println("Bunday son topilmadi.");
        }
    }
}
