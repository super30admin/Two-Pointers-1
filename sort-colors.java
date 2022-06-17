//Time Complexity --> O(n) --> Since we iterate over the array
//Space Complexity --> O(1)

class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        
        while(mid <= high)  {
            if(nums[mid] == 0){
                swap(nums, low, mid);
                mid++;
                low++;
            }else if(nums[mid] == 2) {
                swap(nums, high, mid);
                high--;
            }else {
                mid++;
            }
        }
        
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
}
