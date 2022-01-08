//Time Complexity : O(n)
//Space Complexity : O(1)
class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        while(mid<= right){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                left++;
                mid++;
            }else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }else{
                mid++;
            }
        }
    }
}