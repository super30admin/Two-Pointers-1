// Time Complexity : O(n)
// Space Complexity : O(1) - in place algorithm
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//Solution using 2 pointers aproach
//can also be done with Hashset where Time: O(n) & Space would be O(no of distinct colors)
// just plain sorting which would be O(nlogn)
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int low = 0;
        int high = n-1;
        int mid = low;
        while(mid<=high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;mid++;
            }else{
                mid++;
            }
        }
    }

    private void swap(int[] nums, int num1, int num2){

        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}