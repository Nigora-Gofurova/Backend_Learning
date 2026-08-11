package Problem_Solving_Day_6;

public class Task_07 {
    public void sonlar() {

        for (int i = 100; i <= 999; i++) {

            int yuz = i / 100;
            int bir = i % 10;

            if (yuz == bir) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Task_07 obj = new Task_07();

        obj.sonlar();
    }
}
