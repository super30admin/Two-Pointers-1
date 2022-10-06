// Time Complexity : O(N^2logN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Solution 1: Brute force
// TC: N^3 (Time limit exceeds)
// SC: O(N)

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         if(nums == null || nums.length < 3) return new ArrayList<List<Integer>>();

//         int n = nums.length;
//         Set<List<Integer>> set = new HashSet<>();
//         List<List<Integer>> result = new ArrayList<>();

//         for(int i = 0; i < n; i++) {
//             for(int j = i + 1; j < n; j++) {
//                 for(int k = j + 1; k < n; k++) {
//                     if(nums[i] + nums[j] + nums[k] == 0) {
//                         List<Integer> matched = new ArrayList<>();
//                         matched.add(nums[i]);
//                         matched.add(nums[j]);
//                         matched.add(nums[k]);
//                         Collections.sort(matched);
//                         set.add(matched);
//                     }
//                 }
//             }
//         }

//         for(List<Integer> li: set) {
//             result.add(li);
//         }

//         return result;
//     }
// }

// Solution 2: Sorting then two pointers

// given array
// -1 0 1 2 1 -1 -1 0 0 -1 -4 2

// we ned to sort the array
// after sorting
// -4 -1 -1 -1 -1 0 0 0 1 1 2 2
//  i  L                      R

// first iteration for outer loop
// and two pointers on remaining inner elements

// TC: (NlogN) * N = O(N^2logN)
// SC: O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return new ArrayList<List<Integer>>();

        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        // sort the array O(NlogN)
        Arrays.sort(nums);

        // O(N)
        for(int i = 0; i < n; i++) {

            // move i pointer until it's same as previous to avoid duplicates
            if(i != 0 && nums[i] == nums[i - 1]) continue;

            // break the loop when value at i becomes > 0 because array is sorted
            // so all the next values will always be greater than 0 so no need to check
            if(nums[i] > 0) break;

            // use two pointer method as below
            int L = i + 1;
            int R = n - 1;

            while(L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0) {
                    List<Integer> matched = Arrays.asList(nums[i], nums[L], nums[R]);
                    result.add(matched);
                    L++;
                    R--;

                    // move left until it's same as previous value to avoid duplicates
                    while(L < R && nums[L] == nums[L - 1]) {
                        L++;
                    }

                    // move right until it's same as previous value to avoid duplicates
                    while(L < R && nums[R] == nums[R + 1]) {
                        R--;
                    }
                }
                else if(sum < 0) {
                    L++;

                    while(L < R && nums[L] == nums[L - 1]) {
                        L++;
                    }
                }
                else {
                    R--;

                    while(L < R && nums[R] == nums[R + 1]) {
                        R--;
                    }
                }
            }
        }

        return result;
    }
}