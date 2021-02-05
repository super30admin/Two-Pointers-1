// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        //We will maintain 3 pointers here
        //left: index where 0 should be placed
        //right : index where 2 should be placed
        //curr: This will traverse the array according to following some condition
        int left = 0;
        int right = nums.length-1;
        int curr = 0;
        
        while(curr<=right){
            //If the curr is pointing to 0 ,that means we have to swap curr with left since we wanted to keep the 0 at 
            //left index and then move left index to right and curr to right by one 
            if(nums[curr]==0){
                swap(nums,curr,left);
                curr++;
                left++;
            }else if(nums[curr]==2){//if the curr is pointing to 2 then we will swap right and curr and decrease right
                swap(nums,curr,right);
                right--;
            }else if(nums[curr]==1){//if the curr is 1 then will just have to skip by increasing curr each time
                curr++;
            }
        }
        
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}