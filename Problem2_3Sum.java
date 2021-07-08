import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Time Complexity : o(n2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
       if(nums==null || nums.length <3)
        return new ArrayList<>();
    
    List<List<Integer>> list = new LinkedList<>();
    Arrays.sort(nums);
    
    //take 1 number at a time and do a 2 pointer for other 2 elements
    for(var i=0; i<nums.length-2; i++) {
        
         if(i==0 || (i>0 && nums[i]!=nums[i-1])) {        
            int sum = 0 - nums[i];
            int low = i+1;
            int high = nums.length-1;
             
             while(low < high) {//[1,-1,-1,0] ==> -1 -1 0 1
                
                if(sum == nums[low] + nums[high]) {
                    list.add(Arrays.asList(nums[i], nums[low],nums[high]));
                    
                    //if next number is duplicate, skip that
                    while((low < high) && nums[low]==nums[low+1]) {
                        low++;   
                    }
                    //if previous number is duplicate, skip that
                    while((low < high) && nums[high]==nums[high-1]) {
                        high--; 
                    }
                    
                    low++;
                    high--;
                } else if(sum > nums[low] + nums[high]) {
                    low++;
                } else {
                    high--;
                }
            }//while
        }
    }
        return list;
    }    
}
