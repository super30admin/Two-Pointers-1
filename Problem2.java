// Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      List<List<Integer>> res = new ArrayList<>();
      int n = nums.length;
      for(int i = 0; i < n - 2; i++){
          int target = -nums[i];
          int left = i + 1;
          int right = n - 1;
          while(left < right){
              int sum = nums[left] + nums[right];
              if(sum < target)
                left++;
              else if(sum > target)
                right--;
              else{
                  List<Integer> tmp = Arrays.asList(nums[i],nums[left],nums[right]);
                  res.add(tmp);
                  left++;
                  right--;
                  while(left < right && nums[left]==nums[left-1])
                    left++;
                  while(left < right && nums[right]==nums[right+1])
                    right--;

              }
          }
          while(i < n-1 && nums[i]==nums[i+1])
            i++;
      }
      return res;
    }
}