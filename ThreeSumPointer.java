// Time Complexity : O(n^2)), 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package twoPointer1;
import java.util.*;
public class ThreeSumPointer {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
      if(nums.length == 0 || nums == null) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1, high = nums.length - 1;
            while(low < high){
            int sum = nums[i] + nums[low] + nums[high];
            //if it is a triplet
                if(sum == 0){
                    List <Integer> ls = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(ls);
                    low++; high--;
                    while(low < high && nums[low] == nums[low - 1]) low++;
                    while(low < high && nums[high] == nums[high + 1]) high--;
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
