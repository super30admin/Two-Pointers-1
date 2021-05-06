// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Tackling repititives, but solved using sir's solution


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0 || nums==null) return new ArrayList<>();
        ArrayList<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int compli = (-1)*nums[i];
            int low = i+1; int high = nums.length-1;
            while(low<high){
                if(nums[low]+nums[high]==compli){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    results.add(li);
                    low++;
                    high--;
                    while(nums[low]==nums[low-1] && low<high) low++;
                    while(nums[high]==nums[high+1] && low<high) high--;
                }else if(nums[low]+nums[high]>compli){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return results;
    }
}
