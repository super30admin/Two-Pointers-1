/**
 * time complexity is O(n)
 * space complexity is O(1)
 */
class Solution {
    public void sortColors(int[] nums) {
        int zeroIdx = -1;
        int twoIdx = nums.length;
        int i = 0;
        while(i < twoIdx) {
            if(nums[i] == 0) {
                zeroIdx++;
                swap(nums, zeroIdx, i);
                i++;
            }
            else if(nums[i] == 1) {
                i++;
            }
            else {
                twoIdx--;
                swap(nums, twoIdx, i);
            }
        }
    }
    private void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}