/* Day 02 - Problem Solving for the day - 03.07.2025 

Given  two integers M and N, calculate the  sum of the squares of all the prime numbers between from M and N inclusive.if M is greater than N , return 0 or display an appropriate message 

Test Case 01 : M = 2, N = 10

Test Case 02 : M = 11, N = 20

Test Case 03 : M = 4, N = 4

Test Case 04 : M = 12, N = 8  */
public class pltDayTwo {
    public static void main(String[] args) {
        int M = 2, N = 10; // Test Case 1
        
        // int M = 11, N = 20; // Test Case 2
        
        // int M = 4, N = 4; // Test Case 3
        
        // int M = 12, N = 8; // Test Case 4
        
        if (M > N) {
            System.out.println("M should not be greater than N. Returning 0.");
            System.out.println("Sum of squares: " + 0);
            return;
        }

        int sumOfSquares = 0;
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sumOfSquares += i * i;
            }
        }
        
        System.out.println("Sum of squares of all prime numbers from " + M + " to " + N + ": " + sumOfSquares);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
}
