package Method;

import java.util.Scanner;

public class Task_06 {
    public int almashtir(int son) {

        int yuz = son / 100;
        int on = (son % 100) / 10;
        int bir = son % 10;

        return bir * 100 + on * 10 + yuz;
    }

    public static void main(String[] args) {

        Method.Task_06 myTask = new Task_06();

        Scanner sc = new Scanner(System.in);

        System.out.print("Uch xonali son kiriting: ");
        int son = sc.nextInt();

        System.out.println(myTask.almashtir(son));
    }
}
