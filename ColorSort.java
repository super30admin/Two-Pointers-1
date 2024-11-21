class Solution {
    public void sortColors(int[] nums) {
        int mid=0;
        int low=0;
        int high=nums.length-1;
        int t=0;
        while(mid<=high && low<=high){
            if(nums[mid]==2){
                t=nums[mid];
                nums[mid]=nums[high];
                nums[high]=t;
                high--;
                
            }
            else if(nums[mid]==0){
                t=nums[mid];
                nums[mid]=nums[low];
                nums[low]=t;
                low++;
                mid++;
                
            }
            else
              mid++;
        }
    }
}