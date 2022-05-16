/**

Time Complexity : O(N)
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


**/
class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Set<List<Integer>> output = new HashSet<>();
        
        Arrays.sort(nums);
        
        for(int i =0; i< nums.length; i++)
        {
            int start = i + 1;
            int end = nums.length-1;
            int targetSum = 0 - nums[i];
            
            
            while(start< end)
            {
                int currentSum = nums[start] + nums[end];
                
                if(currentSum == targetSum)
                {
                    output.add(getTriplet(nums, i, start, end));
                    start++;
                    end--;
                }
                else if(currentSum > targetSum)
                    end--;
                else
                    start++;
            }
        }
        
        
        return new ArrayList<>(output);
        
    }
    
    private List<Integer> getTriplet(int nums[], int first, int second, int third)
    {
        List<Integer> list = new ArrayList<>();
        list.add(nums[first]);
        list.add(nums[second]);
        list.add(nums[third]);
        
        return list;
    }
}