package com.ds.rani.twopointers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * Note:
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
//Approach: As it is asked to find triplet, sort the array, then traverse over the array and take to pointers left and right to find triplet.
public class ThreeSum {

    //Time complexity:o(n^2)=> (n log n) to sort the array and (n^2) to find the triplet, higher order terms matters
    //Space complexity:o(1): Not considering Auxilary space here
    /**
     * Method to find all the triplets whose sum is 0.
     * @param nums input array
     * @return all triplets whose sum is zero
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new LinkedList<List<Integer>>();
        if (nums == null || nums.length < 3)
            return finalList;

        //sort the array. time complexity (n log n)
        Arrays.sort( nums );

        //time complexity:n^2
        for (int i = 0; i < nums.length - 2; i++) {
            //To avoid duplicate elements
            if (i == 0 || nums[i] > nums[i - 1]) {
                int left = i + 1;
                int right = nums.length - 1;
                int x = nums[i];
                while (left < right) {
                    int sum = x + nums[left] + nums[right];
                    //If sum of three numbers is zero then crete list of it and add it to result
                    if (sum == 0) {
                        List<Integer> templist = new LinkedList<Integer>();
                        templist.add( x );
                        templist.add( nums[left] );
                        templist.add( nums[right] );

                        finalList.add( templist );
                        left++;
                        right--;
                        //avoid duplicate numbers
                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    } else if (sum < 0)
                        left++;
                    else
                        right--;
                }
            }
        }
        return finalList;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println( ThreeSum.threeSum( arr ) );

    }
}
