// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : Did not focus on putting conditions in while loop and wasted time on debugging


// Your code here along with comments explaining your approach

public class SortColor {
    class Solution {
        public void sortColors(int[] nums) {
            if(nums == null || nums.length ==0) return;
            
            int low=0,mid=0,high=nums.length-1;
            //using 3 pointer approach for this dutch national flag problem
            while(mid<=high){ //iterating till the mid <= high because of hidden case
                if(nums[mid]==0){
                    swap(nums,low,mid);
                    low++;
                    mid++;
                }else if(nums[mid]==1){
                    mid++;
                }else{
                    swap(nums,high,mid);
                    high--; // we are not sincrementing mid here because we need to check it again after swapping with high;
                }
            }
        }
        private void swap(int[] nums,int i, int j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }