package Method;

import java.util.Scanner;

public class Task_08 {
    public int kilobayt(int bayt) {
        return bayt / 1024;
    }
    public static void main(String[] args) {

        Task_08 myTask= new Task_08();

        Scanner sc = new Scanner(System.in);

        System.out.print("Baytni kiriting: ");
        int bayt = sc.nextInt();

        System.out.println(myTask.kilobayt(bayt));
    }
}
