// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet<>();
		for (int i = 0; i < nums.length - 2; i++) 
        {
			//remove duplicates
            if(i>0 && nums[i]==nums[i-1])
                i++;
            int twoSum = -nums[i];
			int p1 = i + 1;
			int p2 = nums.length - 1;
			while (p1< p2)
            {
                int sum =nums[p1]+nums[p2];
                if(twoSum == sum)
                {
                    result.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    p2--;
                    p1++;
                    //check for duplicste value
                    if(nums[p1]==nums[p1-1])
                    {
                        p1++;
                    }
                    if(nums[p2]==nums[p2+1])
                    {
                        p2--;
                    }
                }
                
                else if(sum>twoSum)
                {
                    p2--;
                }
                else
                {
                    p1++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}