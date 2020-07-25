//TC: O(n), n: length of nums[]
//SC: O(1)
//Approach:
//1. We take three pointers, low, mid and high.
//2. low makes sure that whatever left to the low will be 0. high makes sure that whatever right to the high will be 2. mid can point to any of the 1s.
//3. To follow this pattern, we start from low = 0 and mid = 0, high = n-1, everytime mid sees a 2, it swaps with the high, everytime mid sees a 0, it swaps
// with low. When mid reaches low or high, the array is sorted.

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        
        while(low<=mid && mid<=high){
           if(nums[mid]==0){
               swap(nums, low, mid);
               low++;
               mid++;
            }
            else if(nums[mid]==2){
                swap(nums, mid, high);
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
        nums[j] = temp;
    }
}
