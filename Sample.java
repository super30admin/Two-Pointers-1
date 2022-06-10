// Time Complexity :2*O[N]
// Space Complexity : O[1]
// Did this code successfully run on Leetcode : Ran successfully on leetcode
// Any problem you faced while coding this : Trying to find the optimum solution, provided the brute force solution
// 
class Solution {
    public void sortColors(int[] nums) {
        //Three count variable to find the number of times 0,1,2 occurs
        int count0=0,count1=0,count2=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0)count0++;
            if(nums[i]==1)count1++;
            if(nums[i]==2)count2++;
        }
        //Iterate through the entire array with the help of these count variables to get the sorted array of 0,1,2
        for(int i=0;i<count0;i++)nums[i]=0;
        for(int i=0;i<count1;i++)nums[count0+i]=1;
        for(int i=0;i<count2;i++)nums[count0+count1+i]=2;
    }
}