//Time complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        int index = 0;
        int pivot = 1;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                temp = nums[i];
                nums[i] = nums[index];
                nums[index++] = temp;
            }
        }
        index = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>pivot){
                temp = nums[i];
                nums[i] = nums[index];
                nums[index--] = temp;
            }
        }
    }
}