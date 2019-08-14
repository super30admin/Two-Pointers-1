// Time Complexity :O[1]
// Space Complexity : O[N]
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Trying to solve the problem without the use of sort statement
// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        int lo = 0, mid = 0, high = nums.length -1;
        while(mid<=high){
            switch(nums[mid]){
                case 0:
                    int temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++; mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int t = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = t;
                    high--;
                    break;
            }
        }
    }
}
        