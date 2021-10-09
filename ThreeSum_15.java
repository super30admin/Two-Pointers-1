import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(n2)
// Space Complexity : O(1) or O(n c 3)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums == null || nums.length < 3){
            return new ArrayList<List<Integer>>();
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 && nums[i-1] == nums[i]){
                continue;
            }
            
            int j=i+1;
            int k= nums.length -1;
           
            
            while(j < k){
                 int sum = nums[i]+nums[j]+nums[k];
                
                 if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                    while(j < k && nums[j-1]==nums[j]){
                        j++;
                    }

                    while(j < k && nums[k]==nums[k+1]){
                        k--;
                    }
                } else if (sum < 0){
                     j++;
                     while(j < k && nums[j-1]==nums[j]){
                        j++;
                    }
                } else {
                     k--;
                    while(j < k && nums[k]==nums[k+1]){
                        k--;
                    }
                }    
            }
            
           
        }
        
        return result;
    }
}

// TC: O(n2)
// SC: O(1) or O(n c 3)