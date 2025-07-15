/* Day 10 - Revision for the day - 12.07.2025

Move All Zeros to End of Array

Input: [0, 1, 0, 3, 12]

Output: [1, 3, 12, 0, 0] */

public class pltDayTen {
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12}; // Test Case
        
        moveZerosToEnd(arr);
        
        System.out.print("Array after moving zeros to end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; // Pointer for the position of the next non-zero element
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i]; // Place non-zero elements at the front
            }
        }
        
        // Fill the remaining positions with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }



}
