//Time Complexity - O(n)
//Space Complexity - O(1)
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;

        }
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        int mid = 0;
        while(mid <= right){
            if(nums[mid] == 0){
                swap(nums, mid,left);
                mid++;
                left++;
            }
            else if(nums[mid] == 1){
                mid++;

            }
            else{
                swap(nums, mid,right);
                right--;

            }

        }
    }
    private void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
        
    }
