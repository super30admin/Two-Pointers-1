// Time Complexity :O(n) --> beacuse of for loop
// Space Complexity :1
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1 . Iterate through array and count number of 0's, 1's ,2's.
// 2 . Replace the array with 0's first , 1's and 2's using count variables.
public class sortColors {
    //Brute Force approach
    public static void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0) count0++;
            else if(nums[i]==1) count1++;
            else count2++;
        }int start = 0;
        for(int i = start;i<count0;i++) {
            nums[i] = 0;
            start++;
        }
        for(int i = start;i<count0+count1;i++)  {
            nums[i] = 1;
            start++;
        }
        for(int i = start;i<nums.length;i++)  {
            nums[i] = 2;
            start++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(Integer i:nums)
            System.out.print(i+"  " );
    }
}
