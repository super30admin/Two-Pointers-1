// Time Complexity : O(NlogN) + O(N^2) --> O(N^2)
// Space Complexity : O(1) is return list is not considered
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : Couldn't solve on my own


// Your code here along with comments explaining your approach: Use three pointers, change low/high pointers based on the calculated sum value. ALso remember to check for duplicates
// using while loops.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //arraylist to store results
        List<List<Integer>> res = new LinkedList<>();
        
        //sort the arrays
        Arrays.sort(nums);
        
        //initialize pointers
        int i, low, high;
        
        for(i=0; i<nums.length-2; i++){
            
            if(i >0 && nums[i] == nums[i-1]){
                continue;
            }
            
            low = i+1;
            high = nums.length-1;
            
            while(low<high){
            int sum = nums[i] + nums[low] + nums[high];
            
            if(sum == 0){ // happy case
                res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                low++;
                high--;
                
                while(low<high && nums[low] == nums[low-1]){
                    low++;
                }
                
                while(low<high && nums[high] == nums[high+1]){
                    high--;
                }
                
            }else if (sum > 0){
                high--;
            } else{
                low++;
            }
            }  
        }
        
        return res;
    }
}