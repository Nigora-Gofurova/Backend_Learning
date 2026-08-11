package Problem_Solving_Day_6;

public class Task_06 {
    public void sonlar() {

        for (int i = 100; i <= 999; i++) {

            int yuz = i / 100;
            int bir = i % 10;

            if (yuz == 3 && bir == 3) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Task_06 obj = new Task_06();

        obj.sonlar();
    }
}
