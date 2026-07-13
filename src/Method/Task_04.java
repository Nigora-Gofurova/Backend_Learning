package Method;

import java.util.Scanner;

public class Task_04 {
    public int almashtir(int son) {
        int birinchi = son / 100;
        int qolgan = son % 100;

        return qolgan * 10 + birinchi;
    }
    public static void main(String[] args) {

        Task_04 myTask = new Task_04();

        Scanner sc = new Scanner(System.in);

        System.out.print("Uch xonali son kiriting: ");
        int son = sc.nextInt();

        System.out.println(myTask.almashtir(son));
    }
}
