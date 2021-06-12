// Time Complexity : O(n^3)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    // using nested iterations
    public List<List<Integer>> threeSum(int[] nums) {
      //Edge case
      if(nums == null || nums.length == 0) return new ArrayList<>();
      
      int n = nums.length;
      HashSet<List<Integer>> set = new HashSet<>();
      for(int i = 0;i < n-2;i++) {
        for(int j = i+1;j < n-1; j++) {
          for(int k = j+1 ; k< n; k++) {
            //check each element with every other 2 number that makes the sum 0
            if(nums[i] + nums[j] + nums[k] == 0) {
              List<Integer> li = Arrays.asList(nums[i],nums[j],nums[k]);
              Collections.sort(li);
              set.add(li);
            }
          }
        }
      }
        return new ArrayList<>(set);
    }
}