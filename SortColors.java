// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class SortColors {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int tmp = -1;
        int i = 0;
      
      //Two pointer from left and right swapping with current based on either 0 or 2
        while(i <= end){
            if(nums[i]==2){
                tmp = nums[end];
                nums[end] = nums[i];
                nums[i] = tmp;
                end--;
            }else if(nums[i]==0){
                tmp = nums[start];
                nums[start] = nums[i];
                nums[i] = tmp;
                start++;
                i++;
            }else{
                i++;
            }
        }
    }
}
