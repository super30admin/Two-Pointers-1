// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class SortColors{
    private void swap(int[]nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int mid = low;

        while(mid <= high){
            if(nums[mid] == 1)
                mid++;
            else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            } else {
                swap(nums, mid, low);
                low++; mid++;
            }
        }
    }
}