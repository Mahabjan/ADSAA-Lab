import java.util.Scanner;
import java.util.Arrays;  // Make sure to import Arrays

public class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the key is at mid
            if (arr[mid] == key) {
                return mid;  // Return the index if found
            }

            // If the key is smaller than mid, search in the left half
            if (arr[mid] > key) {
                right = mid - 1;
            }
            // Otherwise, search in the right half
            else {
                left = mid + 1;
            }
        }

        return -1;  // Return -1 if not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements and the array from the user
        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array before applying binary search
        Arrays.sort(arr);  // Sort the array using Arrays.sort()
        
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ask the user for the key to search
        System.out.println("Enter the element to search for:");
        int key = scanner.nextInt();

        // Call the binarySearch method with the array and the key
        int result = binarySearch(arr, key);  // Correct way to call the method

        // Output the result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + result);
        }

        scanner.close();
    }
}

