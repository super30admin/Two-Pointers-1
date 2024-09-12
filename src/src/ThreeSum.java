import java.util.*;
/*
TC : 0(n2) : TwoSum i s called n times. Hence, n2
SC :O(n) for storing the sorted array
 */

/**
 * The approach is to use the technique for two sum on a sorted array.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        if(nums.length < 3)
            return list;

        for(int i = 0; i < nums.length - 2; i++) {
            int fixed = i;
            int sum = 0-nums[fixed];
            int first = i+1;
            int last = nums.length-1;

            if(i == 0 || nums[i] != nums[i-1]) {
                while(first < last) {
                    if(nums[first]+nums[last] > sum) {
                        last--;
                    } else if(nums[first]+nums[last] < sum) {
                        first++;
                    } else {
                        list.add(new ArrayList<>(Arrays.asList(nums[fixed],nums[first],nums[last])));
                        while(first+1 < nums.length && nums[first+1] == nums[first]) {
                            first++;
                        }
                        first++;
                        last--;
                    }
                }
            }
        }
        return list;
    }
}
