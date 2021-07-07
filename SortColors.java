
/*
Author: Akhilesh Borgaonkar
Problem: LC 75. Sort Colors (Two-Pointers-1)
Approach: Using two-pointers approach here to compare the element with current index and place them in sorted order by swapping with pointers.
Time Complexity: O(n) where n is number of elements in input array
Space complexity: O(1) constant
verified on IDE.
*/

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left=0, right=n-1;
        int i = 0;

            while(i <= right){
                if(nums[i] == 2){
                    swap(nums, i, right);       //swap color-2 with the rightmost index
                    right--;
                } 
                else if(nums[i] == 0){
                    swap(nums, i, left);        //swap color-0 with the leftmost index
                    left++;
                    i++;
                }
                else
                    i++;                        //if color-1 is found then dont swap
            }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}