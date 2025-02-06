// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach:i have implemented this using 3 pointers concept as given we have colors by checking conditions and adjusting pointers to get sorted array of colors.


class Solution {
    public void sortColors(int[] nums) {
         int n=nums.length;
         int l=0;int m=0;int r=n-1;
         while(m<=r){
            if(nums[m] == 2){
                swap(m,r,nums);
                r--;
            }
            else if(nums[m] == 0){
                swap(l,m,nums);
               
                l++;m++;
            }else{
                   m++;
            }
         }
    }
         public void swap(int i,int j,int[] nums){
            int temp=nums[i];
            nums[i]=nums[j];
           nums[j] =temp;
         }
    
}