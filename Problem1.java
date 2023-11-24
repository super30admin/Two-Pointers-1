// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//Since there are 3 colors to sort, use 3 pointers to denote the different color.
//based on the value of the middle color swap the value and adjust the pointers,
//for example if mid is two then swap with high and decrement high

// Your code here along with comments explaining your approach

class Problem1 {
    public void sortColors(int[] nums) {

        int low = 0 ;
        int high = nums.length-1;
        int mid = 0;

        while(mid<=high){
            if(nums[mid] == 0){
                swap(low,mid,nums);
                low++;
                mid++;
            } else if(nums[mid] == 1){
                mid++;
            } else if(nums[mid]==2){
                swap(mid,high,nums);
                high--;
            }
        }

    }

    private void swap(int a,int b,int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }
}
