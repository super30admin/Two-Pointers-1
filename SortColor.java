//The algorithm sorts an array nums containing only 0, 1, and 2, in-place . 
//It initializes three pointers (low, mid, and high) to partition the array into three regions: 0s, 1s, and 2s. 
//The algorithm swaps elements based on the values at the mid pointer, incrementing or decrementing the pointers accordingly. 
//The time complexity is O(n), where n is the length of the input array nums, space - O(1).
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        if(nums == null || n==0) return;
        int low=0, mid=0, high =n-1;
        while(mid<=high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                 high--;
            }

            else if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }else mid++;
        }
    }

        public void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    
}