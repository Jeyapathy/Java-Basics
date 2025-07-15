public class Program06_SumNaturalNumbers {
    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Sum of first 10 numbers: " + sum(10));
    }
}