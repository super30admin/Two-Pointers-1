// Time Complexity : O(n2)
// Space Complexity :O(3m) where m = number of triplets
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for(int i = 0;i<nums.length-2 ; i++)
        {
            int j = i+1,k = nums.length-1;

            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
