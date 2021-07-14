//Time Complexity:O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length==0){
            return;
        }
        //use three pointers low, mid and high
        int low=0, mid=0, high=nums.length-1;
        //iterate through the array
        while(mid <= high){
            //if mid is pointing to 1 then do mid++ until 0 is found
            if(nums[mid]==1){
                mid++;
            }
            //once o is found swap with low twhich is pointing to 1
            else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            //else just swap with the high element i.e 2
            else{
                swap(nums,high,mid);
                high--;
                
            } 
        }
        
    }
    //helper function for swapping
    private void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}