// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach








class Solution {
    public void sortColors(int[] nums) {
    int i = 0;
    int n = nums.length - 1;
    int j = 0;
    while(i <= n ){
        if(nums[i] == 0){
            swap(nums, j++, i++);   // We keep the array sorted with zeros at the start and the 2's at the end so we swap the elements according to that
        }

        else if(nums[i] == 2){
            swap(nums, n--, i);
        }

        else{
            i++;
        }
    }



    }


    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
