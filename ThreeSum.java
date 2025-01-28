// Approach: We sort the given array and iterate through it, starting from the first element. Fix the first element as the target sum,
// and find a pair with a sum equal to −(target sum). This can be solved using two pointers: the left pointer is initialized to the fixed
// element's index + 1, and the right pointer to n−1. We update the left and right pointers based on whether the sum of the elements at
// those pointers is less than or greater than the target sum. To avoid considering duplicates, we increment (or decrement) the left
// (or right) pointer repeatedly when duplicate elements are clustered in the array.
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/3sum/description/

import java.util.Arrays;
import java.util.Collections;

import java.util.List;
import java.util.ArrayList;

import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;

public class ThreeSum {

    void printTripletsWithSumZero(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            // optimization-1
            if (arr[i] > 0) {
                break;
            }
            // ignore duplicates
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            // became a two sum problem - find pair with given sum
            int sum = -1 * arr[i];
            int low = i + 1, high = n - 1;
            while (low < high) {
                if (arr[low] + arr[high] < sum) {
                    low++;
                } else if (arr[low] + arr[high] > sum) {
                    high--;
                } else {
                    ans.add(new ArrayList<>(List.of(arr[i], arr[low], arr[high])));
                    // ignore duplicates
                    while (low < high && arr[low] == arr[low + 1]) {
                        low++;
                    }
                    // ignore duplicates
                    while (low < high && arr[high] == arr[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                }
            }
        }
        for (List<Integer> list: ans) {
            System.out.println(list.toString());
        }
    }

    void threeSumUsingHashing(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> ans = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // optimization-1
            if (arr[i] > 0) break;
            // optimization-2
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            // became a two sum problem - find pair with given sum
            int targetSum = -1 * arr[i];
            Map<Integer, Integer> map = new HashMap<>(); // element to index map
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (map.containsKey(targetSum - arr[j])) {
                    int k = map.get(targetSum - arr[j]);
                    if (k == j || k == i) {
                        continue;
                    }
                    // duplicates are automatically taken care of by adding 3 sorted elements to a set.
                    List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k]);
                    Collections.sort(list);
                    ans.add(list);
                } else {
                    map.put(arr[j], j);
                }
            }
        }
        for (List<Integer> list: ans) {
            System.out.println(list.toString());
        }
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        //   Input: nums = [-1,0,1,2,-1,-4]
        //   Output: [[-1,-1,2],[-1,0,1]]
        //   Explanation:
        //   nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
        //   nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
        //   nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
        //   The distinct triplets are [-1,0,1] and [-1,-1,2].
        //   Notice that the order of the output and the order of the triplets does not matter.
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        threeSum.printTripletsWithSumZero(arr);
    }
}