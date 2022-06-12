/*
This solution uses a two pointer approach along with sorting to solve the problem. We first sort the array,
and then at each location nums[i] in the array, we check for two sum equal to 0 minus nums[i], and add that 
to the solution. Along the way we ignore duplicates so that the solution does not contain duplicate triplets.

Did this code run on leetcode: Yes
*/
class Solution {
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(nums == null || nums.length == 0 || nums.length < 3)
            return result;
        //Time Complexity: O(nlog(n))
        Arrays.sort(nums);
        //Time Complexity: O(n^2)        
        for(int i = 0; i < nums.length; i++)
        {   //Check for duplicate elements
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            
            int current = nums[i];
            //If current element is greater than 0, then we cannot get the three sum 0 with elements starting from current
            if(current > 0)
                break;
            
            int rem = 0 - current;
            int left = i + 1;                
            int right = nums.length - 1;
            
            while(left < right)
            {   
                int sum = nums[left] + nums[right];
                
                if(sum > rem)
                    right--;
                    
                else if(sum < rem)
                    left++;
                
                else
                {   
                    List<Integer> li = Arrays.asList(current, nums[left], nums[right]);
                    result.add(li);
                    left++;
                    right--;
                    //Duplicate check
                    while(left < right && nums[left] == nums[left - 1]) 
                        left++;
                    while(left < right && nums[right] == nums[right + 1]) 
                        right--;
                }
                    
            }
                   
        }
        
        return result;
    }
}