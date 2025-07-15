/* Day 04 - Problem Solving for the day - 05.07.2025 - Week End Programs 


   1.Write a Java program to   if a number is even or odd.
2. Write a Java program to find the largest of three numbers
3. Write a Java program to check if a number is prime.
4. Write a Java program to print the Fibonacci series up to n terms.                                 
5. Write a Java program to check if a number is a palindrome.
6. Write a Java program to find the factorial of a number.
   
   7 .Write a Java program to           check if a year is a leap year.                                         

8. Write a Java program to check if a character is a vowel or consonant. 

9. Write a Java program to check if a person is eligible to vote.
10. Write a Java program to check whether a number is divisible by 5 and 11.  */

public class pltDayFour 
{
    // 1. Check if a number is even or odd
    public static String isEvenOrOdd(int number) 
    {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
    // 2. Find the largest of three numbers
    public static int findLargest(int a, int b, int c) 
    {
        return Math.max(a, Math.max(b, c));
    }
    // 3. Check if a number is prime
    public static boolean isPrime(int number) 
    {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) return false;
        }
        return true;
    }
    // 4. Print Fibonacci series up to n terms
    public static void printFibonacci(int n) 
    {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    // 5. Check if a number is a palindrome
    public static boolean isPalindrome(int number)
     {
        int original = number, reversed = 0;
        while (number > 0) 
        {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
    // 6. Find the factorial of a number
    public static long factorial(int number)
     {
        if (number < 0) return -1; // Factorial not defined for negative numbers
        long result = 1;
        for (int i = 2; i <= number; i++)
         {
            result *= i;
        }
        return result;
    }
    // 7. Check if a year is a leap year
    public static boolean isLeapYear(int year) 
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // 8. Check if a character is a vowel or consonant
    public static String isVowelOrConsonant(char ch)
     {
        ch = Character.toLowerCase(ch);
        if ("aeiou".indexOf(ch) != -1)
         {
            return "Vowel";
        } 
        else 
        {
            return "Consonant";
        }
    }
    // 9. Check if a person is eligible to vote
    public static boolean isEligibleToVote(int age) 
    {
        return age >= 18;
    }
    // 10. Check if a number is divisible by 5 and 11
    public static boolean isDivisibleBy5And11(int number) 
    
    {
        return (number % 5 == 0 && number % 11 == 0);
    }
    public static void main(String[] args) {
        // Test cases for each method
        System.out.println("Is 4 even or odd? " + isEvenOrOdd(4));
        System.out.println("Largest of 3, 5, 2: " + findLargest(3, 5, 2));
        System.out.println("Is 7 prime? " + isPrime(7));
        printFibonacci(10);
        System.out.println("Is 121 a palindrome? " + isPalindrome(121));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Is 2020 a leap year? " + isLeapYear(2020));
        System.out.println("Is 'a' a vowel or consonant? " + isVowelOrConsonant('a'));
        System.out.println("Is a person with age 20 eligible to vote? " + isEligibleToVote(20));
        System.out.println("Is 55 divisible by 5 and 11? " + isDivisibleBy5And11(55));
    }
    
}
