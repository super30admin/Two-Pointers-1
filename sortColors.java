//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
        //base case
        if(nums==null || nums.length==0)
            return;
        //initialize 3 pointers as low, high and mid
        int l=0, h=nums.length-1, m=0;
        //iterate over the array
        while(m<=h){
            //checking mid value
            if(nums[m]==2){
                swap(nums,m,h);
                h--;
            }
            else if(nums[m]==0){
                swap(nums, m, l);
                l++;
                m++;
            }
            else{
                m++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}