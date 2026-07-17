package Recursion;

public class MaxArray_11 {
    static int max(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];

        return Math.max(arr[index], max(arr, index + 1));
    }

    public static void main(String[] args) {

        int[] arr = {3, 9, 2, 7, 5};

        System.out.println(max(arr, 0));
    }
}
