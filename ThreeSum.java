// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> ans  = new ArrayList();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n-2 ; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int l = i + 1;
            int r = n-1;
            while(l < r)
            {
                int currSum = nums[l] + nums[r] + nums[i];
                if( currSum == 0)
                {
                    ans.add(new ArrayList<Integer>(List.of(nums[i], nums[l], nums[r])));
                    l++; r--;

                    // remove duplicacy
                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l < r && nums[r] == nums[r+1]){
                        r--;
                    }
                }
                else if (currSum > 0)
                    r--;
                else
                    l++;
            }
        }
        return ans;
    }
}
