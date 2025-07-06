class Solution {
    public void sortColors(int[] nums) {
        int low=0,current=0,high=nums.length-1;
        while(current<=high){
            if(nums[current]==0){
                int temp=nums[low];
                nums[low]=nums[current];
                nums[current]=temp;
                low++;
                current++;
            }
            else if(nums[current]==1){
                current++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[current];
                nums[current]=temp;
                high--;
            }
        }
    }
}