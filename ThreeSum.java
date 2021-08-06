import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/3sum/
/*
Time: 
Space:  
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        while (low < high && nums[low] == nums[low + 1])
                            low++;
                        while (low < high && nums[high] == nums[high - 1])
                            high--;

                        low++;
                        high--;

                    } else if (nums[low] + nums[high] > sum)
                        high--;
                    else
                        low++;
                }

            }

        }

        return result;
    }

}
