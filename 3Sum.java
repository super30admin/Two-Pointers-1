//space - constant
//time - O(n^2)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length <= 2)
        {
            return new ArrayList<>();
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        //iterate only till 3rd last element after which no triplet could be formed
        for(int i = 0; i < nums.length - 2; i++)
        {
            if(i != 0 && nums[i] == nums[i - 1])
            {
                continue; //{0, 0, 0, 0, 0} should give only [0, 0, 0] so skip duplicates
            }
            
            int low = i + 1;
            int high = nums.length - 1;
            
            while(low < high)
            {
                int currentSum = nums[i] + nums[low] + nums[high];
                if(currentSum == 0)
                {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    
                    while(low < high && nums[low] == nums[low - 1])
                    {
                        low++; //to handle duplicates
                    }
                    
                    while(low < high && nums[high] == nums[high + 1])
                    {
                        high--; //to handle duplicates
                    }
                }
                else if(currentSum < 0)
                {
                    low++;
                    while(low < high && nums[low] == nums[low - 1])
                    {
                        low++; //to handle duplicates
                    }
                }
                else
                {
                    high--;
                    while(low < high && nums[high] == nums[high + 1])
                    {
                        high--; //to handle duplicates
                    }
                }
            }
        }
        return result;
    }
}
