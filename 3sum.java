// Time Complexity : O(nlogn + o(n^2))
// Space Complexity :
o(1)
// Did this code successfully run on Leetcode :
yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;                
            twoSumFunction(nums,-nums[i],i+1,result);
            }
         return result;
        }
  
  public void twoSumFunction(int [] nums,int target,int left,List<List<Integer>> result){
      int right=nums.length-1;
      while(left<right){
          if(nums[left]+nums[right]==target){
              result.add(Arrays.asList(-target,nums[left],nums[right]));
              left++;
              right--;
          while (left < right && nums[left] == nums[left - 1])
          left++; // skip same element to avoid duplicate triplets
          while (left < right && nums[right] == nums[right +1])
          right--;
          }
          else if(nums[left]+nums[right]<target){
              left++;
          }
          else{
              right--;
          }
      }
  }
}