// Time complexity : O(nlogn) :sorting + O(n) : traversal  -> Overall : O(nlogn)
// Space complexity : O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0;
        
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the elements
        Arrays.sort(nums);
        
        while (i < nums.length - 2){
            
            // take two pointers
            int left = i + 1;
            int right =  nums.length - 1;
            
            while (left < right){
                
                int sum = nums[i] + nums[left] +  nums[right];
                
                if (sum == 0){
                    
                    // Store the triplets into a list
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    
                    result.add(triplet);
                 
                    // Skip the left and right for the duplicates
                    while ( left < right && nums[left] == nums[left + 1]){
                        left++;
                      }

                    while (left < right && nums[right - 1] == nums[right]){
                        right--;
                    }
                
                    left++;
                    right--;
                }
                // If sum < 0 : Move left pointer towards right
                else if (sum < 0){
                    left++;
                }
                // If sum > 0 : Move right pointer towards left
                else{
                    right--;
                }
                
               
            }
            
             // Skip the iteration for the duplicates
            while (i < nums.length - 2 && nums[i+1] == nums[i]){
                i++;
            }
                
            i++;
            
        }
        
        return result;
    }
    
}