// Time Complexity : O(nlog2(n)) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return new ArrayList<>();
        
        // initialize output list
        List<List<Integer>> result = new ArrayList<>();
        
        // sort the array
        Arrays.sort(nums);
        
        // traverse the array
        for(int i=0; i < nums.length; i++){
            
            // remove the outside duplicacy
            if(i > 0 && nums[i] == nums [i-1]) continue;
            
            // initialize low and high pointers
            int low = i + 1;
            int high = nums.length - 1;
            
            // traverse until low and high don't cross each other
            while(low < high){
                
                // calculate the sum of triplet
                int sum = nums[i] + nums[low] + nums[high];
                
                // add the triplet to the list if sum is 0 and 
                // increment the low pointer and decrement the high pointer
                
                if(sum == 0){
                    
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    
                    low++;
                    high--;
                    
                    // remove internal duplicacy
                    while(low < high && nums[low] == nums[low - 1]){
                        low++;
                    }
                    
                    while(low < high && nums[high] == nums[high + 1]){
                        high--;
                    }
                }
                // if sum is greater than 0; decrement the high pointer
                // since our aim is to go towards zero sum
                else if(sum > 0){
                    high--;
                }
                // else sum is less than 0; increment the low pointer
                // since our aim is to go towards zero sum
                else{
                    low++;
                }
            }
        }
        return result;
    }
}