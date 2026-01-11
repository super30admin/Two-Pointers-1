// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// Brute force - nested iteration, find 3 pairs with 3 loops. O(N^3) time
// With unsorted array, using one hashset for keeping the triplets and another for doing O(1) search to find complement sum.
// We need to sort the triplets before adding to set. Keep 2 pointer p1 amd p2, find 3 values such that
// nums[p1] , nums[p2] , (0- (nums[p1]+nums[p2]) is in hashmap)  - O(N^2 + nlogn) time, O(N) space

// Using sorted array and 2 pointers approach, we keep 3 pointers and check if there sum is equal to 0. Move three pointers
// accordingly if we see any duplicates.
// O(N^2 + nlogn) = ~ O(N2) time, O(1) space

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        // Time Complexity : O(N^2 + NlogN) = ~O(N^2)
        // Space Complexity : O(1)
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (len == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                result.add(List.of(nums[0], nums[1], nums[2]));
            }
            return result;
        }

        Arrays.sort(nums);
        int index = 0;
        while (index < len) {
            if(nums[index] > 0){
                break;
            }
            if (index > 0 && nums[index] == nums[index - 1]) {
                index++;
                continue;
            }
            int first = index;
            int second = index + 1;
            int third = len - 1;
            while (second < third) {
                int currentSum = nums[first] + nums[second] + nums[third];
                if (currentSum == 0) {
                    result.add(List.of(nums[first], nums[second], nums[third]));
                    second++;
                    third--;
                    while (second < third && nums[second] == nums[second - 1]) {
                        second++;
                    }
                    while (second < third && nums[third] == nums[third + 1]) {
                        third--;
                    }
                } else if (currentSum < 0) {
                    second++;
                } else {
                    third--;
                }
            }
            index++;
        }
        return result;
    }

    public List<List<Integer>> threeSumHashing(int[] nums) {
        // Time Complexity : O(N^2), outer loop and inner loop to find all combination of triplets + constant(sorting 3 values)
        // Space Complexity : O(N),
        // Keep additional hashset to check if the 0-(nums1+nums2) exists in the input, so O(NXN)
        // Keep temporary hashset with list of size 3, to avoid entering duplicate combinations in the final result.
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        if (len == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                result.add(List.of(nums[0], nums[1], nums[2]));
            }
            return result;
        }
        // Hashset to keep unique triplets and add them to final result list. Avoid duplicates in outer loop
        HashSet<List<Integer>> tempResult = new HashSet<>();
        for (int first = 0; first < len-1; first++) {
            // Hashset to check if the complementary sum is present in the input, also to avoid inner duplicates
            HashSet<Integer> temp = new HashSet<>();
            for (int second = first + 1; second < len-2; second++) {
                int currentSum = -(nums[first] + nums[second]);
                if (temp.contains(currentSum)) {
                    addToResult(tempResult, nums[first], nums[second], currentSum);
                } else {
                    temp.add(nums[second]);
                }
            }
        }
        result.addAll(tempResult);
        return result;
    }

    private void addToResult(HashSet<List<Integer>> result, int first, int second, int third) {
        List<Integer> triplet = Arrays.asList(first,second,third);
        Collections.sort(triplet);
        result.add(triplet);
    }

}
