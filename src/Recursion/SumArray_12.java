package Recursion;

public class SumArray_12 {
    static int sum(int[] arr, int index) {
        if (index == arr.length)
            return 0;

        return arr[index] + sum(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        System.out.println(sum(arr, 0));
    }
}
