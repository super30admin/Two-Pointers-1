//TC - O(n)
//SC - O(1)
class Solution {
    public void sortColors(int[] nums) {
        int mid = 0;
        int low =0;
        int high = nums.length-1;
        
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else{
                mid++;
            }
        }
    }
    public void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}