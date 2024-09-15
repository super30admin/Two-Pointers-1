// Time Complexity : O(n^2) n- number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(nums == null || nums.length <= 2)
            return result;
        
        for(int i=0; i<nums.length-2; i++) {
            
            //removing duplicates outside
            if(nums[i] == nums[i-1])
                continue;
            
            int low = i+1;
            int high = nums.length - 1;
            
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                
                if(sum == 0) {
                    //add to the result list
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    
                    //removing duplicates inside
                    while(nums[low] == nums[low-1])
                        low++;
                    
                    //removing duplicates inside
                    while(nums[high] == nums[high+1])
                        high++;
                    
                } else if(sum < 0) {
                    //go higher to the target
                    low++;
                } else {
                    //go lower to the target
                    high--;
                }
            }
        }
        return result;
    }
}