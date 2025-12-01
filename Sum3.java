import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Time Complexity : O(N^2logN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort the array nums
        //consider one element at a time, and consider rest of array to find the pair
        // perform two pointers on rest of array and if sum > 0 right-- else left++
        // if nums[i] > 0 then break; coz we wont find any triplets that will add up to 0
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(0 != i && nums[i] == nums[i-1]) continue; // avoid same numbers being used again for uniquness
            if(nums[i] > 0) break;
            int left = i + 1, right = nums.length - 1;
            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0)
                {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }
                else if(sum > 0)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        return result;
    }
}
