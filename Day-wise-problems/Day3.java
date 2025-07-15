/* Day 03 - Problem Solving for the day - 04.07.2025 

Given two integers M and N, calculate the  sum of the factorials of all the integers from M and N inclusive.if M is greater than N , return 0 or display an appropriate message

Test Case 01 : M = 3, N = 5

Test Case 02 : M = 0, N = 4

Test Case 03 : M = 5, N = 5

Test Case 04 : M = 6, N = 4  */
public class pltDayThree {
    public static void main(String[] args) {
        int M = 3, N = 5; // Test Case 1
        
        // int M = 0, N = 4; // Test Case 2
        
        // int M = 5, N = 5; // Test Case 3
        
        // int M = 6, N = 4; // Test Case 4
        
        if (M > N) {
            System.out.println("M should not be greater than N. Returning 0.");
            System.out.println("Sum of factorials: " + 0);
            return;
        }

        long sumOfFactorials = 0;
        for (int i = M; i <= N; i++) {
            sumOfFactorials += factorial(i);
        }
        
        System.out.println("Sum of factorials from " + M + " to " + N + ": " + sumOfFactorials);
    }

    private static long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    
}
