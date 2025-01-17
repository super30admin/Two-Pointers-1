// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class SortColors {
        public void sortColors(int[] nums) {
            if(nums == null || nums.length ==0){
                return;
            }
            int n = nums.length-1;
            int left =0, mid=0, right = n;

            while(mid<= right){
                if(nums[mid] == 2){
                    int temp = nums[mid];
                    nums[mid] = nums[right];
                    nums[right] = temp;
                    right--;
                }else if(nums[mid] == 0){
                    int temp = nums[mid];
                    nums[mid] = nums[left];
                    nums[left] = temp;
                    left++;
                    mid++;
                }else if(nums[mid] == 1){
                    mid++;
                }
            }
        }
}
