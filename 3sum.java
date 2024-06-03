// Time Complexity : Sorting - O(nlogn) + O(n^2) = O(n^2) => As we iterate over the entire array of size n and then inner while loop traverse n -1 elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. To avoid duplicates there are multiple conditions which I missed

/*
Approach: Used 2 pointers technique. Started a for loop to fix the position for i and then used 2 pointer technique for elements starting from i +1. Calculated sum of i, left and righ pointer.
If sum is 0 add to to result and move both left & right pointers, If sum is less than 0 moved left pointer to find equivalent positive number which will result to 0, if sum is greater than 0 decremented value of right pointer.
To avoid duplicates added few conditions to compare the neighbours
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length == 0 || nums == null) {
            return new ArrayList<List<Integer>>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            // To avoid duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // If this condition is true it indicates we can never reach zero
            if (nums[i] > 0) {
                break;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {

                if (nums[i] + nums[left] + nums[right] == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    //To avoid duplicates
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }

                    //To avoid duplicates
                    while (nums[right] == nums[right + 1] && left < right) {
                        right--;
                    }

                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}

//Approach: Used Brute force approach with 3 for loops and used Hashset to not allow duplicates. Time Complexity: O(n^3) & Space Complexity: O(1)
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {

//         if (nums.length == 0 || nums == null) {
//             return new ArrayList<>();
//         }

//         List<List<Integer>> result = new ArrayList<>();
//         HashSet<List<Integer>> hSet = new HashSet<>();

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 for (int k = j + 1; k < nums.length; k++) {

//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         List<Integer> sortedList = Arrays.asList(nums[i], nums[j], nums[k]);
//                         Collections.sort(sortedList);
//                         if (!hSet.contains(sortedList)) {
//                             result.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                             hSet.add(sortedList);
//                         }

//                     }
//                 }
//             }
//         }
//         return result;

//     }
// }