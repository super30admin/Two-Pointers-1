//Tc: O(n);
//sc:o(n);


class Solution {
    public void sortColors(int[] nums) {
        if(nums== null || nums.length == 0)
            return;
        int low=0;
        int mid=0;
        int high = nums.length-1;
        while(mid<=high)
        {
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap (nums,mid,high);
                high--;
                
            }
            else{
                mid++;
            }
        }
        
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] =temp;
    }
}