// Time Complexity : O(n^2) = Max(O(n^2), O(n(logn)))
// Space Complexity : No additional space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        return helpertwopointers(nums);
        // return helperTwoSumsApproach(nums);
    }

    private List<List<Integer>> helpertwopointers(int[] nums) {
        //stores the result
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        //Sort the Array 
        //Time complex: O(nLogn);
        Arrays.sort(nums);

        //Time complex: O(n^2);
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            if (nums[i] > 0)
                break;

            int low = i + 1;
            int high = n - 1;

            while (low < high) {
                //take sum
                int sum = nums[i] + nums[low] + nums[high];
                //if sum is zero than increase the left ptr and decrease the right ptr
                if (sum == 0) {
                    //add the values  in the result
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                    //Handles duplicates on left side
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }

                    //Handles duplicates on right side
                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                //if sum is greater than zero than decrease the right ptr    
                } else if (sum > 0) {
                    high--;
                
                //if sum is greater than zero than increase the left ptr
                } else {
                    low++;
                }
            }
        }
        return result;

    }

    // private List<List<Integer>> helperTwoSumsApproach(int[] nums) {
    //     Set<List<Integer>> result = new HashSet<>();

    //     for (int i = 0; i < nums.length - 1; i++) {
    //         // int [] subArray = IntStream.range(i+1, nums.length).map(j ->
    //         // nums[j]).toArray();
    //         int[] subArray = Arrays.copyOfRange(nums, i + 1, nums.length);
    //         if (subArray.length < 2) {
    //             break;
    //         }

    //         int complement = 0 - nums[i];
    //         List<List<Integer>> listOfList = twoSums(subArray, complement);
    //         for (List<Integer> list : listOfList) {
    //             list.add(nums[i]);
    //             Collections.sort(list);
    //         }
    //         result.addAll(listOfList);

    //     }

    //     return new ArrayList<>(result);
    // }

    // private List<List<Integer>> twoSums(int nums[], int target) {
    //     Set<List<Integer>> result = new HashSet<>();

    //     Set<Integer> set = new HashSet<>();

    //     for (int i = 0; i < nums.length; i++) {
    //         int complement = target - nums[i];

    //         if (set.contains(complement)) {
    //             List<Integer> list = new ArrayList<>();
    //             list.add(nums[i]);
    //             list.add(complement);
    //             result.add(list);
    //         } else {
    //             set.add(nums[i]);
    //         }
    //     }
    //     return new ArrayList<>(result);
    // }

}
