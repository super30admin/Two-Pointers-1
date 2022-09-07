//Approach: Using the 2-Pointers approach
//Overall Time Complexity: O(N^2 + Nlog(N)) = O(N^2)
//Overall Space Complexity: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(nums == null || nums.length == 0) return res;
        
        int n = nums.length;
        
        //We need to sort the array here for easy traversal and handling duplicates
        Arrays.sort(nums);
        
        for(int i = 0; i < n-2; i++){
            //A small optimization
            if(nums[i] > 0) break;
            
            int low = i+1;
            int high = n-1;
            //Outside duplicates
            if(i != 0 && nums[i] == nums[i-1]) continue;
            
            while(low < high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    res.add(li);
                    low++;
                    high--;
                    
                    //Inner Duplicates Handling
                    //As we are changing the base variables low and high
                    //We would put the check here for those base variables
                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high+1]) high--;
                      
                }else if(sum < 0) {
                    low++;   
                }else{
                  high--;  
                } 
            }
            
        }
        
        return res;
        
    }
}