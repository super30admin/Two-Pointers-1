// Time Complexity = O(n)
// Space Complexity = O(1)


class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while(mid<=high){
            if(nums[mid] == 2){
                swap (nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0){
                swap (nums, mid, low);
                low ++;
                mid ++;
            }
            else {
                mid ++;
            }
        }
        
        if((mid <= high) && (nums[low] == nums[low-1])) low++;
        if((mid <= high) && (nums[high] == nums[high+1])) high--;
    }
    
    private void swap(int [] nums, int i, int j){
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}