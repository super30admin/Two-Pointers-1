/*
Time Complexity - O(N) where N is the size of the array "nums".
Space Complexity - O(1)
*/
class Solution {

    private void swap(int []a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp; 
    }

    public void sortColors(int[] nums) {
        
        int low = 0;
        int high = nums.length-1;

        for(int i = low; i <= high; i++) 
        {
            while(i < high && nums[i] == 2){
                swap(nums, i, high);
                high--;
            }

            while(i > low && nums[i] == 0) {
                swap(nums, i, low);
                low++;
            }
        }
    }
}
