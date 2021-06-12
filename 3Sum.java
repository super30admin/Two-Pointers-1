// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      //result arr
      List<List<Integer>> result = new ArrayList<>();
      //Edge case
      if(nums == null || nums.length < 3) return new ArrayList<>();
      
      int n = nums.length;
      Arrays.sort(nums);
      for(int i = 0; i< n; i++) {
        //outside duplicate
        if(i!=0 && nums[i] == nums[i-1]) continue;
        int left = i+1; int right = n-1;
        while(left < right) {
          //check the sum 
          int sum = nums[i] + nums[left] + nums[right];
          if(sum == 0) {
            List<Integer> li = Arrays.asList(nums[i],nums[left],nums[right]);
            result.add(li);
            left ++;
            right --;
            //inside duplicate
            while(left < right && nums[left] == nums[left-1]) left++;
            while(left < right && nums[right] == nums[right +1] )right--;
          } else if(sum < 0) {
            left ++;
          } else {
            right --;
          }
          }
        }
            return result;
      }
  
}