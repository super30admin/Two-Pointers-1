import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Time Complexity : O(n2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/*

This code efficiently finds all unique triplets in an array that sum to zero using the two-pointer approach
after sorting. It iterates through the array while ensuring no duplicate elements are considered as
the first element of the triplet. The left and right pointers are used to explore potential pairs,
adjusting dynamically based on the sum. If a valid triplet is found,
both pointers move while skipping duplicates to avoid redundant solutions.
The sorting ensures O(n²) time complexity, making it an optimal approach compared to brute-force methods.


*/
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            if(nums[i]>0)
                break;
            int left=i+1;
            int right=nums.length - 1;
            while(left<right)
            {
                int sum=nums[left]+nums[right]+nums[i];
                if(sum==0)
                {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1])
                        left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }
                else if(sum>0)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        return ans;
    }
}