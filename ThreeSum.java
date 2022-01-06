// Time Complexity : O(n^2) where n is length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int low = i + 1, high = n - 1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    res.add(li);
                    low++; high--;
                    while(low < high && nums[low] == nums[low - 1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high + 1]){
                        high--;
                    }
                }
                else if(sum < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return res;
    }
}
