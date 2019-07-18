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
    //TWO POINTER APPROACH
    // Time Complexity :O(n) --> beacuse of while loop
    // Space Complexity :1
    // 1 . Have 2 pointers start and end . Start from index 0.
    // 2 . If value at index i is 0 then swap start and mid values and move mid to next element . 
    // 3.  If value is 2 then swap end and mid and change end by end-1 . If value 1 then move mid 1 step next so that all 0's will be at start , 2's at end .  
    public static void sortColors2(int[] nums){
        int start = 0,mid = 0,end = nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
                swap(nums,start++,mid++);
            }
            else if(nums[mid] == 2){
                swap(nums,mid++,end--);
            }
            else
                mid++;
        }
    }

    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors2(nums);
        for(Integer i:nums)
            System.out.print(i+"  " );
    }
}
