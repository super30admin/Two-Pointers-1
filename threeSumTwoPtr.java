import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Time complexity O(nlogn)(for sorting) + O(n^2)(for evaluating 3 sum).. overall O(n^2)
 * 
 * space complexity is O(1)
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) {
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int low = i+1;
            int high = nums.length-1;
            
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if( sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(triplet);
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]) {
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]) {
                        high--;
                    }
                } 
                else if(sum > 0) {
                    high--;
                }
                else {
                    low++;
                }
            }
        }
        return result;
        
    }
}