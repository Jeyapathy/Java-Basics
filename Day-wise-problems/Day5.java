/* Day 05 - Problem Solving for the day - 07.07.2025  

Given a number ‘N’, find out the sum of the first N natural numbers.

Test Case 1:

Input: N=5
Output: 15

Test Case 2:

Input: N=6
Output: 21  */

public class pltDayFive 
{
    
    public static void main(String[] args) 
    {
        int N = 5; 
        
        if (N < 1) 
        {
            System.out.println("N should be a positive integer. Returning 0.");
            System.out.println("Sum of first N natural numbers: " + 0);
            return;
        }

        int sum = sumOfNaturalNumbers(N);
        
        System.out.println("Sum of the first " + N + " natural numbers: " + sum);
    }

    private static int sumOfNaturalNumbers(int n) 
    {
        return n * (n + 1) / 2; 
    }

        
}