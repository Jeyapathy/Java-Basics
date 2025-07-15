import java.util.Scanner;

public class Day1{

    public static long productOfOdds(int M, int N) {
        if (M > N) {
            System.out.println("Invalid Range");
            return 1;
        }

        long product = 1;
        boolean foundOdd = false;

        for (int i = M; i <= N; i++) {
            if (i % 2 != 0) {
                product *= i;
                foundOdd = true;
            }
        }

        return foundOdd ? product : 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        long result = productOfOdds(M, N);
        if (M <= N) {
            System.out.println(result);
        }
    }
}
