// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Keep three pointers low, mid and high. 
 * If the element at the mid is 2, swap with element at high and decrement high. 
 * If the element at the mid is 0, swap with low and increment mid and low. 
 * Else increment mid as the element is 1 and it is at the right position. 
 */
class Problem1 {
    public void sortColors(int[] nums) { 
        int n = nums.length; 
        int low = 0; 
        int mid = 0; 
        int high = n - 1; 
        while(mid <= high){
            for(int i =0; i < n; i++){
                if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
                }
                else if(nums[mid] == 0){
                    swap(nums,mid,low);
                    low++;
                    mid++;
                }
                else{
                    mid++;
                }
            }
        }
    }
    private void swap(int nums[],int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    }
}