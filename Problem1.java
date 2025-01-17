public class Problem1 {
    // Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
    public void sortColors(int[] nums) {
        //approach is there are only 3 colors so we can use 3 pts to take care of each
        if(nums == null || nums.length == 0){
            return;
        }
        int n = nums.length;

        int left = 0;//for red
        int mid = 0;//for green
        int right = n-1;//for blue

        while(mid<=right){
            if(nums[mid] == 0){
                swap(nums,left, mid);
                left++;
                mid++;//why mid++ here because there can't exist any value which could go left of 0;
            }else if(nums[mid] == 2){//why not mid++ here because , the value swapped with mid can be 0 or 1 we need to process that value also
                swap(nums,right, mid);
                right--;
            }else{
                mid++;
            }
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
