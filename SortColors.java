// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class SortColors {
    public static void sortColors(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int count0 = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                count0++;
            } else if(nums[i] == 1){
                count1++;
            } else if(nums[i] == 2){
                count2++;
            }
        }

        int i = 0;
        while(i<nums.length){
            if(i<count0){
                nums[i] = 0;
            } else if(i<count0+count1){
                nums[i] = 1;
            } else {
                nums[i]= 2;
            }
            i++;
        }
    }
    public static void main(String args[]){
        int[] nums = new int[]{ 2,0,2,1,1,0};
        sortColors(nums);

        for(int i : nums){
            System.out.println(i);
        }

    }
}
