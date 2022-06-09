//approch 1
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// approch 2
// Time Complexity : O(n^3)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : no TLE
// Any problem you faced while coding this : no

// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

class Main {

    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            // here if nums[i] > 0 that means there is not possible three values that's sum
            // is less than 0 as there
            // array is already sorted
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // low pointer at i + 1
            int l = i + 1;
            // high pointer at last index
            int r = n - 1;
            // traverse through array using two pointers
            while (l < r) {
                // here we are summing three elements
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    // to avoid inside duplicacy we are move forward left pointer and move backward
                    // right pointer
                    // if two consecutive element are same
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                    while (l < r && nums[r] == nums[r + 1])
                        r--;

                } else if (sum > 0) {
                    // it means we are ahead in the array from required pair so we decrease right
                    // pointer
                    r--;
                } else {
                    // it means we are away from the required pointer
                    l++;
                }
            }

        }
        return result;
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<List<Integer>>();
        int n = nums.length;

        // three for loops for checking all the combinations
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    // if sum == 0 we add it to our set
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        // here to avoid duplicacy we first sort the collection then add it to the
                        // result set
                        Collections.sort(list);
                        result.add(list);
                    }
                }
            }
        }

        // convert set to list and return
        return new ArrayList<>(result);
    }

    public static List<List<Integer>> threeSum3(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<List<Integer>>();
        int n = nums.length;

        // here first we fix first element then using two sum we are going to get our
        // pair
        for (int i = 0; i < n - 1; i++) {

            // multiply nums[i] with -1 to get complement of it in remaining array
            int x = nums[i] * -1;
            // set for checking complement is already in the set or not
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                // complement of x
                int comp = x - nums[j];

                // check if complement in the list is available or not
                if (set.contains(comp)) {
                    // if available then we add this three elements in the list
                    List<Integer> list = Arrays.asList(nums[i], nums[j], comp);

                    // here to avoid duplicacy we first sort the collection then add it to the
                    // result set
                    Collections.sort(list);
                    result.add(list);
                }
                set.add(nums[j]);
            }
        }
        // convert set to list and retur
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum1(nums));
        System.out.println(threeSum2(nums));
        System.out.println(threeSum3(nums));

    }
}