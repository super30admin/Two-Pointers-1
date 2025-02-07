/* Time Complexity: O(n^2) as the two sum can be computed in O(n) using two pointers.
 * Space Complexity: O(1) no extra space needed
 * Leetcode: Yes
 * Any Issues: yes, but resolved in class.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sum3
{
    private void twoSum(int[] nums, int i, List<List<Integer>> result)
    {
        if(i == nums.length-1) return;
        int start = i+1;
        int end = nums.length-1;
        while(start < end)
        {
            int sum = nums[i] + nums[start] + nums[end];
            if(sum < 0)
                start++;
            else if(sum > 0)
                end--;
            else
            {
                result.add(Arrays.asList(nums[i], nums[start++], nums[end--]));
                while(start<nums.length && nums[start-1] == nums[start]) start++;
                //while(end>=0 && nums[end+1] == nums[end]) end--;
            }
        }
        

    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++)
        {
            if(i==0 || nums[i-1] != nums[i] && nums[i] <= 0)
                twoSum(nums, i, result);
        }
        return result;
    }
}