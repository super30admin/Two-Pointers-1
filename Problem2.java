// 3 points :  
	// using two pointer.  
	// 1. using the  binary search concept and having the twopointers( [twosum] , [third])
    // 2. if the twosum = -third, then add to list.
    // 3. if twoSum < -third  then increase low else decrease high

	// Time Complexity : O(n * logn)
	// Space Complexity : Array List Size O(result elements) i.e Constant memory
	
	// Did this code successfully run on Leetcode : Yes
	// Any problem you faced while coding this : No


	// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
        
          Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=n-1; i>1; i--)   {
            int third = nums[i];
            int l = 0;
            int r = i-1;
            
            while(l<r)  {
                List<Integer> list = new ArrayList<Integer>();
                int twoSum= nums[l] + nums[r];
                if(twoSum == (0-third))  {
                    list = Arrays.asList(nums[l], nums[r], third);
                    if(!res.contains(list))  {
                        res.add(list);
                    }
                }
                
                if(twoSum < -third)  
                    l++;
                else
                    r--;
            }
            
        }
        return res;
	
        
    }
}
