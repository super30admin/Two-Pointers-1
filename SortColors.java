// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Here we are taking three pointers for respective colors.
class SortColors{
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else if(nums[mid]==0){
                swap(nums,low, mid);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }
    private void swap(int nums[], int i, int j){
        if(i==j) return;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}