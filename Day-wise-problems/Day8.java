/* Day 08 - Problem Solving for the day - 10.07.2025

Given an array of integers, check whether the array is sorted in ascending order.

Test Case 01 :

arr1 = [1, 2, 3, 4, 5]

output : sorted 

Test Case 02 :

arr2 = [1, 2, 2, 3, 4]

output : sorted 

Test Case 03 :

arr3 = [5, 4, 3, 2, 1]

output : Not sorted  */

public class pltDayEight
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 2, 3, 4, 5}; 
        
        if (isSorted(arr1)) 
        {
            System.out.println("The array is sorted.");
        } 
        else 
        {
            System.out.println("The array is not sorted.");
        }
    }

    private static boolean isSorted(int[] arr)
     {
        for (int i = 0; i < arr.length - 1; i++)
         {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}