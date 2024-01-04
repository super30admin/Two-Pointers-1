/*
* Approach:
*  1. Fix the first element and apply two sum solution on other part.
        Two sum solution techniques:
            a. Bruteforce - O(n^2)
            b. Fix one element and apply Binary Search - 
                        (sorting -->O(nlogn)) + O(nlogn)
            c. Two pointer technique - O(nlogn) + O(n)
            d. Hashing - O(n)
* 
*  2. Applying the two pointer technique,
        sort the entire array - O(nlogn)
        
        fix the first element, apply two pointer on remaining part.

        if sum < 0
            move left pointer
        
        else if sum >0 
            move right pointer.
        
        else 
            move both pointers and check for duplicates.
            (because we should eliminate triplet duplicates)

        To avoid inner duplicates, 
            we can check previous element with curr in case of start pointer
            we can cehck curr element with next in case of end pointer.
* 
*  3. Similarly, outer duplicates can be avoided by checking prev and curr.
        When first element is >0, we cannot find any triplets whose sum is 0.
        therefore, we break.
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(nlogn) + O(n^2) ---> O(n^2)
* 
* Space Complexity: O(1)
* 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int index = 0; index < nums.length - 2; index++) {
            // preventing outer duplicates
            if (index != 0 && nums[index] == nums[index - 1])
                continue;

            // if first element is positive, triplets sum cannot be zero.
            // as array is sorted in ascending order.
            if (nums[index] > 0)
                break;

            int start = index + 1, end = nums.length - 1;

            while (start < end) {
                int currSum = nums[index] + nums[start] + nums[end];

                if (currSum == 0) {
                    result.add(Arrays.asList(nums[index], nums[start], nums[end]));

                    start++;
                    end--;

                    // preventing inner duplicates
                    while (start < end && nums[start] == nums[start - 1])
                        start++;

                    while (start < end && nums[end] == nums[end + 1])
                        end--;
                } else if (currSum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return result;
    }
}
