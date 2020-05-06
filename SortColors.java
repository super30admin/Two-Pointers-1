package com.ds.rani.twopointers;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * Note: You are not suppose to use the library's sort function for this problem.
 * Example:
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */
//Approach: I am using 2 pointer approach here.
// all the elements to the left side of the red pointer are 0,all the elements to the right side  of blue pointer are 2
// and thats why only element remain between them are 1. j is current or traversing pointer
public class SortColors {

    //Time complexity:o(n)
    //Space complexity:o(1) as I am doing it in place
    public static void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        //red=0,white=1,blue=2
        int red = 0;
        int blue = nums.length - 1;
        int j = 0;//current pointer
        //all the elements to the left of red are 0,all the elemnts to the right of blue are 2 and thats
        // why only element remain between them are 1
        while (j <= blue) {
            if (nums[j] == 0) {//if current element is red
                swap( red, j, nums );
                red++;
                j++;
            } else if (nums[j] == 2) {//current elemet is blue(2) then swap it with blue index
                swap( blue, j, nums );
                blue--;
                //we are not incrementing j here because we dont know what is the element swapped with j
            } else {//current element is 1(white)
                j++;
            }
        }

    }

    private static void swap(int i, int j, int[] nums) {
        int tempVal = nums[i];
        nums[i] = nums[j];
        nums[j] = tempVal;
    }

    /**
     * Helper method to print the Array
     *
     * @param nums
     */
    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print( num + " " );
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 1, 0,2};
        System.out.println( "Array before sort:" );
        printArray( arr );
        SortColors.sortColors( arr );
        System.out.println( "\nArray after sort:" );
        printArray( arr );
    }
}
