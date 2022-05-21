// O(n^2) time // twoSum is O(n) and we call it n times
// O(n) space

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length && nums[i] <=0; i++){
            if (i == 0 || nums[i-1] != nums[i]){
                twoSum(nums, i, result);
            }
        }
        return result;    
    }
    
    void twoSum(int[] nums, int i, List<List<Integer>> result){
        int p1 = i + 1;
        int p2 = nums.length - 1;
        
        while (p1 < p2){
            int sum = nums[i] + nums[p1] + nums[p2];
            if (sum < 0){
                p1++;
            }
            else if (sum > 0){
                p2--;
            }
            else{ // sum == 0
                result.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                p1++;
                p2--;
                while (nums[p1 - 1] == nums[p1] && p1<p2){
                    p1++;
                }
            }
        }
    }
}