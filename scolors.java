
# Time complexity:O(n)
# Space complexity: 0(1)
# Did code run successfully on leetcode: yes
# Any problem you faced: No


class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
            swap(nums,mid,high);
            high--;
            }
        }
    }
        private void swap(int[] nums, int i, int j){
            int temp;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

}