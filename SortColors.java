//The approach here is to use 3 pointer to track 3 numbers. Here we track 0 with left pointer, 1 with mid pointer and 2 with right pointer
//We traverse the mid from start index till it is greater than the right index
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

    private void swap(int[] nums, int index, int otherIndex){
        int temp = nums[index];
        nums[index] = nums[otherIndex];
        nums[otherIndex] = temp;
    }
}
