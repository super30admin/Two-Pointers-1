// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//https://leetcode.com/problems/3sum/
//two pointers
	// 2) Sort the array first
	// 3) Run loop 
	// 	a. Take 1st element as fixed
	// 		i. Then run left and right two pointer from 1 to n
	// 	b. No take 2nd element as fix
	// 		i. Then run left and right two pointer from 2 to n
	// 4) At any point u find sum of 3 eleemnts to 0, put in result array.

public IList<IList<int>> ThreeSum(int[] nums) {
        
        if(nums == null || nums.Length == 0)
            return new List<IList<int>>();
        
        List<IList<int>> result = new List<IList<int>>();
        Array.Sort(nums);
        
        for(int i = 0; i < nums.Length; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            
            int left = i+1;
            int right = nums.Length -1;
            
            while(left< right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0)
                {
                    result.Add(new List<int>{nums[i], nums[left], nums[right]});
                    left++;
                    right--;
                    
                    while(left < right && nums[left] == nums[left-1])
                    {
                        left++;
                    }
                    
                    while(left < right && nums[right] == nums[right+1])
                    {
                        right--;
                    }
                    
                }
                else if(sum < 0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
                
            }
        }
        
        
        
        return result;
    }




//brute force
//O(n^3), time limit exceded

public IList<IList<int>> ThreeSum(int[] nums) {
        
        if(nums == null || nums.Length == 0)
            return List<IList<int>>();
        
        List<IList<int>> result = new List<IList<int>>();
        HashSet<List<int>> set = new HashSet<List<int>>();
        
        for(int i = 0; i < nums.Length; i++)
        {
            for(int j = i+1; j < nums.Length; j++)
            {
                for(int k = j+1; k < nums.Length; k++)
                {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0)
                    {
                        List<int> tempList = new List<int>(){nums[i], nums[j], nums[k]};
                        tempList.Sort();
                        if(!set.Contains(tempList))
                        {
                            set.Add(tempList);
                            result.Add(tempList);
                        }
                    }
                }
            }
        }
        return result;
    }
}