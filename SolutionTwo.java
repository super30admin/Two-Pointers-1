// Time complexity: O(n^2)
// Space complexity: O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> retList = new ArrayList<>();
        
        if(nums == null || nums.length <= 2){
            return retList;
        }
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int left = i+1;
            int right = nums.length-1;
            
            while(left < right){
                int curSum = nums[i] + nums[left] + nums[right];
                
                if(curSum == 0){
                    List<Integer> sublist = Arrays.asList(nums[i], nums[left], nums[right]);
                    retList.add(sublist); 
                    left++;
                    right--;
                    
                    while(left < right && nums[left] == nums[left -1]){
                        left++;
                    }
                    
                    while(left <right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
                else if(curSum<0){
                    left ++;
                    while(left < right && nums[left] == nums[left -1]){
                        left++;
                    }
                }
                else{
                    right--;
                    while(left <right && nums[right] == nums[right+1]){
                        right--;
                    }
                }                
            }            
        }
        return retList;
    }
}
