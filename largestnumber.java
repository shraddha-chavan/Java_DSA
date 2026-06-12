import java.util.*;

    public static void main(String[] args) {
        int arr[] = { 1, 2, 10, 4, 5 };
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest number is: " + largest);
    }

