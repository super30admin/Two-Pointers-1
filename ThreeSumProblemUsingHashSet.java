// Time Complexity : O(n^2)
// Space Complexity : O(n) + O(n) // one for result and another one for checking compliments
// Did this code successfully run on Leetcode : Yes
import java.util.*;

public class ThreeSumProblemUsingHashSet {
    public static List<List<Integer>> threeSum(int[] nums) {

        int target = 0;
        HashSet resultSet = new HashSet();

        for(int i=0; i<nums.length-1; i++) {

            HashSet set = new HashSet();            // creating hashset to store results(To remove duplicates)
            int outerComp = target - nums[i];       // calculating compliment for inner loop need

            for (int j = i+1; j < nums.length; j++) {
                int innerComp = outerComp - nums[j]; //calculating compliment to check in the set

                if (set.contains(innerComp)) {
                    Integer[] tempArr = {nums[i], nums[j], innerComp};
                    Arrays.sort(tempArr);
                    resultSet.add(Arrays.asList(tempArr));
                }

                set.add(nums[j]);
            }
        }

        return new ArrayList<>(resultSet);
    }
    public static void main(String[] args) {
        int[] nums = {-4,-3,-2,-1,-1,0,0,1,2,3,4};
        System.out.println(threeSum(nums));
    }
}