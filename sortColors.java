// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 75
//Type : 3 Pointer

class Solution {
    public void sortColors(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0)
            return;
        
        //initializing low and mid at 0 position and high at length
        int low =0 , mid= 0 , high = nums.length -1;
        while(mid <= high){
            
            //only care for mid at 0 or 2
            if(nums[mid] == 1) mid++;
            //2 should be at last(dont bother if both the elements are 2)
            else if(nums[mid]== 2) 
            {    
                //swap function is called
                swap(nums,mid,high);
                high--; //only decrement high as it will be cared. Dont increment low as it might be 0 or 1
            }
            //if nums is 0, then replace 0 with 1's
            else{
                //swap function is called
                swap(nums,mid,low);
                low++; //both low and high are sorted now
                mid++;
            }
        }
    }
    private int[] swap(int[] nums ,int i ,int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
        return nums;
    }
}