package Problem_Solving_Day_6;

public class Task_08 {

    public void sonlar() {

        for (int i = 10; i <= 99; i++) {

            int on = i / 10;
            int bir = i % 10;

            int summa = on + bir;

            if (summa == 9 || summa == 15) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Task_08 obj = new Task_08();

        obj.sonlar();
    }
}
