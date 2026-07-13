package Method;

import java.util.Scanner;

public class Task_05 {

    public int teskariSon(int son) {

        int yuz = son / 100;
        int on = (son % 100) / 10;
        int bir = son % 10;

        return bir * 100 + on * 10 + yuz;
    }

    public static void main(String[] args) {

        Task_05 myTask = new Task_05();

        Scanner input = new Scanner(System.in);

        System.out.print("Uch xonali son kiriting: ");
        int son = input.nextInt();

        System.out.println(myTask.teskariSon(son));
    }
}
