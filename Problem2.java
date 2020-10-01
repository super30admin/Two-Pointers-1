// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes, 20ms
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Basically sort the array and we need to find the negative and add the triplet to the list, else if the sum goes beyond 0 -> decrement high else increment low

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        if(nums.length < 3){
            return list;
        }
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                
                int low = i+1;
                int sum = 0 - nums[i]; // find the negative
                int high = nums.length-1;
                
                while(low < high){
                    
                    if(nums[low] + nums[high] == sum){
                        
                        list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        
                        while(low < high && nums[low] == nums[low+1]){
                            low++;
                        }
                        
                        while(low < high && nums[high] == nums[high-1]){  // skip the duplicates
                            high--;
                        }
                        low++;
                        high--;
                        
                    }
                    
                    else if(nums[low] + nums[high] < sum){ // > sum, increase the boundary
                        low++;
                    }
                    else{
                        high--;
                    }
  
                }
            }
            
  
        }
        
        return list;
        
    }
}