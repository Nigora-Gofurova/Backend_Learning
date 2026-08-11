package Problem_Solving_Day_6;

public class Task_05 {
    public void sonlar() {

        for (int i = 100; i <= 999; i++) {

            int on = (i / 10) % 10;

            if (on == 7) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Task_05 obj = new Task_05();

        obj.sonlar();
    }
}
