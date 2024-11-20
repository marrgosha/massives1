package fi.margokomarova.massive1.util;

public class Task1 {
    public static void calculateTask1() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int counter = 0;
        for (int index = 0; index <= arr.length - 1; index++) {
            if (arr[index] % 2 == 0) {
                counter = counter + 1;
            }
        }
        System.out.println("The number of even numbers=" + counter);
    }
}
