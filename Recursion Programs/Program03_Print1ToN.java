public class Program03_Print1ToN {
    public static void print1ToN(int n, int current) {
        if (current > n) return;
        System.out.print(current + " ");
        print1ToN(n, current + 1);
    }
    public static void main(String[] args) {
        print1ToN(10, 1);
    }
}