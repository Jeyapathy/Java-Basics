public class Program18_IndexOfElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int key = 15;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + key + ": " + index);
    }
}