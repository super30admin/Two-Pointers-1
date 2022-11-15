/*
    Time Complexity = O(n)
    Space Complexity = O(1)
    Did this code successfully run on Leetcode : yes
 */

package com.madhurima;

import java.util.Arrays;

public class SortColors {
}

class SolutionA {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;

        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else if(nums[mid] == 0){
                swap(nums, mid, low);
                low++; mid++;
            }else{
                mid++;
            }
        }

    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SolutionA s = new SolutionA();
        int[] nums = {2,0,2,1,1,0};
        s.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
