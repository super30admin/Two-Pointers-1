// Time Complexity : o(nlogn+ n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach- we sort the array first, then
//initialized low and high as two pointers, and checked if they equal to the target, if not we moved
//the low/high accordingly


import java.util.*;
/**
 * ThreeSum : ThreeSum
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 08, 2024)
 * @since : 1.0 (Nov 08, 2024)
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1, high = n-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if( sum == target){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]){
                        high--;
                    }
                }
                else if(sum < target){
                    low++;
                }else{
                    high--;
                }
            }

        }


        return result;
    }
}
