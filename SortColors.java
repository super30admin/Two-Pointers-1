// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Maintain 3 pointers low, mid, high for each of the colors. iterate over mid and swap places for low and high. Things out of the low and high pointers are always sorted and only need to take care with mid

class Solution {

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0; int mid=0; int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            } else if(nums[mid]==0){
                swap(nums,low,mid);
                low++; mid++;
            } else mid++;
        }
    }
}