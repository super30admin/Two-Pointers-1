import java.util.*;

public class problem2 {
    public List<List<Integer>> threeSum(int[] nums) {
// Time Complexity : O(n) n-> number of elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        
        
        for(i = 0; i<n; i++){
            if(i>0 && nums[i-1] == nums[i]) continue;
            if(nums[i] > 0) break;
            int left = i + 1;
            int right = n - 1;
            
            while(left < right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum == 0){
                List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                result.add(li);
                left++;
                right--;
                while(left < right && nums[left-1] == nums[left]){
                    left++;
                }
                while(left < right && nums[right+1] == nums[right]){
                    right--;
                }
            }else if(sum < 0){
                left++;
            }else{
                right--;
                }
            }
        }
        return result;
    }
}
