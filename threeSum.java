// Time Complexity : O( n^2) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i+1; int high = nums.length-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);            
                    low++;
                    high--;
                    while(nums[low] == nums[low-1]) low++;
                    while(nums[high] == nums[high+1]) high--;
                    result.add(li);
                }
                else if(sum < 0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
}
