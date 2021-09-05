// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Take 3 pointers, and based on the mid pointer swap the elemnts
// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        if( nums == null || nums.length == 0) return;
        int low = 0; int mid = 0; int high = nums.length-1;
        while( mid <= high){
            if( nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }else if ( nums[mid] == 0){
                swap( nums, mid, low);
                low++; mid++;
            }else{
                mid++;
            }
        }
    }

    private void swap( int[] a , int i, int j){
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}