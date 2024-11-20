package fi.margokomarova.massive1.util;

public class Task4 {
    public static void calculateTask4() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int sum = 0;
        for (int index = 0; index <= arr.length - 1; index++) {
            sum = sum + arr[index];
        }
        System.out.println("summa of all numbers=" + sum);
    }
}

