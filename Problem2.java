// Time Complexity : 
//      threeSum() - O(n*n)
//      
// Space Complexity :
//      threeSum() - O(1)
//
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return new ArrayList<>();
        
        Arrays.sort(nums);
        
        List<List<Integer>> lili = new ArrayList<>();
        
        for(int i=0; i < nums.length; ++i)
        {
            List<Integer> li = twoSum(nums, i, -nums[i]);
            li.add(nums[i]);
            
            if(li.size() == 3)
            {
                if(!hasDupl(lili,li))
                {
                    lili.add(li);
                }
            }
        }
        
        return lili;
    }
    
    private List<Integer> twoSum(int[] nums, int idx, int target)
    {
        int i = idx + 1, j = nums.length - 1;
        
        while(i <= j)
        {
            if(nums[i] + nums[j] == target && ( (i != idx) && (j != idx) ))
            {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                return temp;
            }
            else if(nums[i] + nums[j] < target)
            {
                i++;
            }
            else if(nums[i] + nums[j] > target)
            {
                j--;
            }
        }
        
        return new ArrayList<>();
    }
    
    private boolean hasDupl(List<List<Integer>> lili, List<Integer> li)
    {
        for(List<Integer> l : lili)
        {
            if(l.get(0) == li.get(0) && l.get(1) == li.get(1) && l.get(2) == li.get(2))
            {
                return true;
            }
        }
        
        return false;
    }
}