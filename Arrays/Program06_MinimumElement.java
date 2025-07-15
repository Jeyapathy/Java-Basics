public class Program06_MinimumElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 99, 45};
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        System.out.println("Minimum element: " + min);
    }
}