// Time Complexity : O(n^2logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We extend 2 sum 2 pointers here to 3sum. We sort the array and fix a value and then find 2Sum in remaining array such that total of all 3 values is 0. 
   Whenever we see a duplicate we continue to avoid duplication. When we see nums[i] > 0 that means theres's no triplet since array is sorted and values cannot sum to 0.
   Finally array is iterated and result which is stored in list and contains the triplets is returned.
*/


class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
       if(nums == null || nums.length == 0)
           return null;

       List<List<Integer>> result = new ArrayList<>();

       Arrays.sort(nums);
       for(int i = 0; i < nums.length - 1; ++i) {
           if(nums[i] > 0)
               break;

           if(i != 0 && nums[i] == nums[i - 1])
               continue;

           int lo = i + 1;
           int hi = nums.length - 1;

           while(lo < hi) {
               int sum = nums[i] + nums[lo] + nums[hi];
               if(sum == 0) {
                   result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                   lo ++;
                   hi --;
                   while(lo < hi && nums[lo] == nums[lo - 1])
                       lo ++;
                   while(lo < hi && nums[hi] == nums[hi + 1])
                       hi --;
               } else if(sum > 0)
                   hi --;
               else
                   lo ++;
           }
       }
       return result;
   }
}