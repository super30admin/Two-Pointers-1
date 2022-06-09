// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.Arrays;

class SortColors {
    public int[] sortColors(int[] nums) {
        int start = 0;
        int curr = 0;
        int end = nums.length-1;

        int temp;
        while(curr<=end){
            if(nums[curr]==0){
                temp = nums[start];
                nums[start] = nums[curr];
                nums[curr] = temp;
                start++;
                curr++;
            }
            else if(nums[curr]==2){
                temp = nums[curr];
                nums[curr] = nums[end];
                nums[end] = temp;
                end--;
            }
            else{
                curr++;
            }
        }

        return nums;
    }

    public static void main(String [] args){
        int [] nums = new int[]{2,0,2,1,1,0};
        SortColors sc = new SortColors();
        System.out.println(Arrays.toString(sc.sortColors(nums)));
    }
}