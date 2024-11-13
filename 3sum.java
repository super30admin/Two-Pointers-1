// Time Complexity : O(n*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//approach: iterates through the array to keep one pointer at first location. then we see the
// sum remaining to form 0. then we use 2 pointer approach to find the 2 numbers that add up to
//get the desired sum remaining.

// Your code here along with comments explaining your approach

public class 3sum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> arr =new ArrayList<>();
            Arrays.sort(nums);
            int n=nums.length;
            for(int i=0;i<n;i++)
            {
                if(i>0 && nums[i]==nums[i-1]) continue;
                if(nums[i]>0) break;
                int low=i+1;
                int high=n-1;
                while(low<high)
                {
                    int sum=nums[i]+nums[low]+nums[high];
                    if(sum==0)
                    {
                        arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        low++;
                        high--;
                        while(low<high && nums[low]==nums[low-1])
                            low++;
                        while(low<high && nums[high]==nums[high+1] )
                            high--;
                    }
                    else if(sum>0)
                    {
                        high--;
                    }
                    else
                        low++;
                }
            }
            return arr;
        }
    }
}
