//TC: O(n)
//SC: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low =0, high = n-1, mid = 0;

        while(mid<=high){
            if(nums[mid]==2){
                swap(nums, mid, high);
                high--;
            }else if(nums[mid]==0){
                 swap(nums, mid, low);
                 low++;
                 mid++;
            }else{
                mid++;
            }
        }
    }
    private void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}