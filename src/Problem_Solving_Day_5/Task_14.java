package Problem_Solving_Day_5;

public class Task_14 {
    public void sonlar() {

        int summa = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0 && i % 3 == 0 && i % 5 != 0) {
                summa = summa + i;
            }
        }

        System.out.print(summa);
    }

    public static void main(String[] args) {

        Task_14 obj = new Task_14();

        obj.sonlar();
    }
}
