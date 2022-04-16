// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//First sort the array
//Traverse the array from i =0 and then find the two sum for the target equal to -nums[i] on the rest of the array starting from i+1;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums==null||nums.length<3)
            return ans;
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++){
            if(i!=0 && nums[i-1]==nums[i]){
                continue;
            }
            int l = i+1;
            int h = nums.length-1;
            int target = -nums[i];
            while(l<h){
                if(nums[l]+nums[h]==target){
                    List<Integer> res = Arrays.asList(nums[i],nums[l],nums[h]);
                        ans.add(res);
                    l++;
                    h--;
                    while(l<h && nums[l-1]==nums[l])
                        l++;
                    while(l<h &&nums[h] == nums[h+1])
                        h--;
                }
                else if(nums[l]+nums[h]<target){
                    l++;
                }
                else{
                    h--;
                }
            }
        }
        return ans;
    }
}