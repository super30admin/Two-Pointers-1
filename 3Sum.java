// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    int n = nums.length;

    for(int i = 0; i<n-2; i++) {
      if(i>0 && nums[i]==nums[i-1]) {
        continue;
      }
      int left = i+1;
      int right = n-1;

      while(left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if(sum == 0) {
          result.add(Arrays.asList(nums[i], nums[left], nums[right]));
          while(left<right && nums[left+1]==nums[left]) {
            left++;
          }
          while(left<right && nums[right-1]==nums[right]) {
            right--;
          }
          left++;
          right--;
        }else if(sum < 0) {
          left++;
        }else {
          right--;
        }
      }
    }
    return result;
  }
}

