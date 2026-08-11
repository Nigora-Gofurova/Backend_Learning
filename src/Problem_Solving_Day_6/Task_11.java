package Problem_Solving_Day_6;

public class Task_11 {
    public void sonlar() {

        for (int i = 10; i <= 99; i++) {

            int on = i / 10;
            int bir = i % 10;

            if (on + bir > 12) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Task_11 obj = new Task_11();

        obj.sonlar();
    }
}
