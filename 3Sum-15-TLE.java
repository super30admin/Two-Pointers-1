class Solution {
    // Brute Force Approach -- Time Limit Exceeded Error
    // Time Complexity: O(n^3) where n is number of elements in the nums array
    // Space Complexity: O(n) 
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return new ArrayList<>();
        }
        // Set created to store distinct sets 
        HashSet<List<Integer>> set = new HashSet<>();
        // List created to store output
        List<List<Integer>> result = new ArrayList<>();
        // length of nums
        int n = nums.length;

// 
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                      List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                      Collections.sort(temp);
                      // If this set is not in the set then add it to the set and result
                      if(!set.contains(temp))
                      {
                          set.add(temp);
                          result.add(temp);
                      }
                    }
                }
            }
        }

        return result;





        
        
    }
}
