//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int left = 0; 
        int mid = 0;
        int right = nums.length -1;
        while(mid<=right){
            if(nums[mid] == 0){
                swap(nums, mid, left);
                left++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, right);
                right--;
            }
            else{
                mid++;
            }
        }
    }

    private void swap(int[] nums, int idx, int otherIndex){
        int temp = nums[idx];
        nums[idx] = nums[otherIndex];
        nums[otherIndex] = temp;
    }
}
