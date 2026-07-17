package Recursion;

public class PrinttArray_13 {
    static void print(int[] arr, int index) {
        if (index == arr.length)
            return;

        System.out.println(arr[index]);
        print(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        print(arr, 0);
    }
}
