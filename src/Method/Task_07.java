package Method;

import java.util.Scanner;

public class Task_07 {

    public int yigindi(int son) {
        int yuz = son / 100;
        int on = (son % 100) / 10;
        int bir = son % 10;

        return yuz + on + bir;
    }
    public static void main(String[] args) {

        Task_07 myTask = new Task_07();

        Scanner sc = new Scanner(System.in);

        System.out.print("Uch xonali son kiriting: ");
        int son = sc.nextInt();

        System.out.println(myTask.yigindi(son));
    }
}
