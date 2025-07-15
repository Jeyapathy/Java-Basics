public class Program15_SwapFirstLast {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}