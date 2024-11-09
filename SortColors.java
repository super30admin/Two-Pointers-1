// Approach : Two pointer Approach with mid swinging b/w low and high . Low pointer collects
// zero's and High pointer collect 2's. mid will be collecting 1's. iterate through array and move the pointers and swamp the elements accordigly.
// Time : O(n)
// Space: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int mid = 0; //initially
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            } else if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            } else{
                mid++;
            }
        }
    }

    private void swap(int[] nums, int a,int b){
        int temp =nums[a];
        nums[a]=nums[b];
        nums[b] = temp;
    }
}