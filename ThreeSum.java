import java.util.*;

// Time Complexity : O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(nums == null || nums.length == 0){
            return result;
        }
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            
            if(nums[i] > 0){
                break;
            }
            
            int low = i+1;
            int high = n-1;
            
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                
                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]){
                        high--;
                    }
                }
                else if(sum > 0){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return result;
    }
}