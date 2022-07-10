// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES


class SortColors {
    public void sortColors(int[] nums) {
        
        if(nums==null || nums.length==0){
            return;
            
        }
        int low =0, mid=0,high=nums.length-1;
        
        while(mid<=high){
        	//increment low and mid
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }
            // right position increment mid
            else if(nums[mid]==1){
                mid++;
            }
            
            // decrement high
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        
    }
    
    private void swap(int[]nums,int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}