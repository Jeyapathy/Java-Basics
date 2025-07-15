public class Program10_PositiveNegativeCount {
    public static void main(String[] args) {
        int[] arr = {-5, 3, -2, 8, -1, 0};
        int pos = 0, neg = 0;
        for (int num : arr) {
            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
        }
        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
    }
}