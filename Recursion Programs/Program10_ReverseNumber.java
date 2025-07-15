public class Program10_ReverseNumber {
    public static void reverseNumber(int n) {
        if (n == 0) return;
        System.out.print(n % 10);
        reverseNumber(n / 10);
    }
    public static void main(String[] args) {
        reverseNumber(1234);
    }
}