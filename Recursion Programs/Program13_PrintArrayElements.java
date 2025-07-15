public class Program13_PrintArrayElements {
    public static void printArray(int[] arr, int index) {
        if (index == arr.length) return;
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        printArray(arr, 0);
    }
}