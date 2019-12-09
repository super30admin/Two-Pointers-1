// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach: There are 3 cases. In a given array, mid can be 0, 1 or 2. We have written conditions based on that. We keep repeating these
// conditions until mid pointer is less than or equal to high pointer.

class ArrangeColors {
    public void sortColors(int[] nums) {
        
        int low =0;
        int mid =0;
        int high = nums.length -1;
        
        while (mid<=high) {
            if (nums[mid] == 0 ) {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid ++;
            }
            
            else if (nums[mid] ==2) {
                swap(nums,mid,high);
                high--;
            }
        }
        
    }
    
    private void swap (int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i]= temp;
    }
    
}