// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * First sort the array. After that use the 2 pointer approach fixing the outer i element. The inner pointers will
 * be low and high. If the sum is greater, decrement high or else increment low. If the outer i pointer reaches a 
 * point where the later is a sorted array with elements greater than 0, we know that it is impossible to find
 * a solution then.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output_arr = new ArrayList<>();
        
        for(int x = 0; x < nums.length - 2; x++){
            if(x == 0 || (nums[x] != nums[x-1]))
            {
                int low = x + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[x];
                
                while(low < high)
                {
                    if(nums[low] + nums[high] == sum)
                    {
                        output_arr.add(Arrays.asList(nums[x],nums[low],nums[high]));
                        while(low < high && nums[low] == nums[low + 1])
                            low++;
                        while(low < high && nums[high] == nums[high - 1])
                            high--;
                        
                        low++;
                        high--;
                    }
                    else if(nums[low] + nums[high] > sum)
                    {
                        high--;                        
                    }
                    else{
                        low++;
                    }                    
                }                    
            }
        }
        return output_arr;        
    }    
}
