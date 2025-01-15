// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length ==0){
            return;
        }
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int mid = 0;
        while(mid<=right){
            if (nums[mid] == 2){
                swap(nums,mid, right);
                right--;
            }else if(nums[mid]==0){
                swap(nums,mid, left);
                left++;
                mid++;
            }else{
                mid++;
            }
        }
    }
    public void swap(int[] nums, int left, int right){
        int temp =  nums[left];
        nums[left] = nums[right];
        nums[right]= temp;
    }
}