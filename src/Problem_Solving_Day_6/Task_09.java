package Problem_Solving_Day_6;

public class Task_09 {
    public void sonlar() {

        for (int i = 100; i <= 999; i++) {

            int yuz = i / 100;
            int on = (i / 10) % 10;
            int bir = i % 10;

            int summa = yuz + on + bir;

            if (summa == 20) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Task_09 obj = new Task_09();

        obj.sonlar();
    }
}
