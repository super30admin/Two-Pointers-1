//constant space and linear time
//passed all lletocde cases
//used approach discussed in class
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int low=0;
        int mid=0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                Swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                Swap(nums, mid, high);
                high--;
            }

        }
    }
    private void Swap(int[]nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}