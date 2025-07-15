public class Program05_MaximumElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 99, 45};
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        System.out.println("Maximum element: " + max);
    }
}