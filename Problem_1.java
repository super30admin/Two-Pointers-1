/*
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Runs with Runtime: 0 ms,
                                             faster than 100.00% of Java online submissions for Sort Colors in Leetcode.
Any problem you faced while coding this : Implemented as taught in class
*/

import java.util.*;

class SortColor {
    public void sortColors(int[] nums) {
        int low = 0 ;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high)
        {
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 0){
                swap(nums, low++, mid++);
            }
            else{
                swap(nums, mid, high--);
            }
        }
    }

    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        SortColor sc = new SortColor();
        int[] nums = {2,0,2,1,1,0};
        sc.sortColors(nums);
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
