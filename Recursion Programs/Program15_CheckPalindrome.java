public class Program15_CheckPalindrome {
    public static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }
    public static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }
    public static void main(String[] args) {
        int number = 121;
        System.out.println(number + " is palindrome? " + isPalindrome(number));
    }
}