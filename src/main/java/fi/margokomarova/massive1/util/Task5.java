package fi.margokomarova.massive1.util;

public class Task5 {
    public static void calculateTask5() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int sum1 = 0;
        int sum2 = 0;
        for (int index = 0; index <= arr.length - 1; index++) {
            if (index % 2 == 0) {
                sum1 = sum1 + arr[index];
            } else {
                sum2 = sum2 + arr[index];
            }
        }
        int difference = sum1 - sum2;
        System.out.println("The difference of numbers with even and odd indexes=" + difference);
    }

}
