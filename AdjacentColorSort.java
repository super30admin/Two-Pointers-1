/**
 * Idea: 
 * 1. Count the number of 0s, 1s, and 2s.
 * 2. Iterate over the array again and update array based on counter values
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1) - no extra space
 * Leetcode: Yes
 *  */

class AdjacentColorSort {

    public void sortColors(int[] nums) {
        int color0=0, color1=0, color2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) color0++;
            if(nums[i] == 1) color1++;
            if(nums[i] == 2) color2++;
        }

        for(int i=0;i<color0;i++)
            nums[i] = 0;
        for(int i=color0;i<color0+color1;i++)
            nums[i] = 1;
        for(int i=color0+color1;i<color0+color1+color2;i++)
            nums[i] = 2;
    }
    public static void main(String[] args){
        System.out.println("Adjacent Color Sort");
        AdjacentColorSort obj = new AdjacentColorSort();
        int[] nums = {2,0,2,1,1,0};
        obj.sortColors(nums);
    }
}