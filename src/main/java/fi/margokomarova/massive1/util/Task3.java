package fi.margokomarova.massive1.util;

public class Task3 {
    public static void calculateTask3() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int prime = arr.length;
        int counter = 0;
        for (int index = 0; index <= arr.length - 1; index++) {
            if (arr[index] > 1) {
                for (int j = 2; j < arr[index]; j++) {
                    if (arr[index] % j == 0) {
                        counter = counter + 1;
                        break;
                    }
                }
            } else {
                counter = counter + 1;
            }
        }
        prime = prime - counter;
        System.out.println("The number of prime numbers=" + prime);
    }
}

