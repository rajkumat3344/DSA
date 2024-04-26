package org.rdutta.dsa.array;


import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.print("Enter the target you want two sum: ");
        int target = sc.nextInt();
        // Declare an array of the desired size
        int[] numbers = new int[size];

        // Read integers into the array using a loop
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(twoSum(numbers, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] resultArr = new int[2];
        for(int current=0; current<nums.length; current++){
            for(int next = current+1; next < nums.length-1; next++)
            if((nums[current]+nums[next]) == target){
                resultArr[0] = current;
                resultArr[1] = next;
            }
        }
        return resultArr;
    }
}
