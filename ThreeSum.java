import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
## Problem2 (https://leetcode.com/problems/3sum/)
 
Time Complexity :   O (N^2) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (15. 3Sum)
Any problem you faced while coding this :       No
 */

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        
        for( int i= 0; i< nums.length - 2; i++){
            if(nums[i] > 0)
                break;
            
            // handling outside duplicates
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            
            int low = i+1;
            int high = nums.length - 1;
            
            while (low < high){
                int sum = nums[i] + nums[low] + nums[high];
                
                if (sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    
                    // handling inside duplicates
                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    } 
                    while(low < high && nums[high] == nums[high+1]){
                        high--;
                    }        
                }
                else if (sum > 0){
                    high--;
                }
                else
                    low++;
            }
        }
        return result;
    }

    public static void main(String args[]) 
    { 
        ThreeSum obj = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.print(obj.threeSum(nums));
    }
}