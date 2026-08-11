package Problem_Solving_Day_6;

public class Task_10 {
    public void sonlar() {

        int count = 0;

        for (int i = 100; i <= 999; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }

        System.out.print(count);
    }

    public static void main(String[] args) {

        Task_10 obj = new Task_10();

        obj.sonlar();
    }
}
