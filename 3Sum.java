// Time Complexity : O(n*n)
// Space Complexity :O(n) extra space for inner set
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// No Input Manipulation
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Initialize a set to store unique triplets
        Set<List<Integer>> result = new HashSet<>();

        // Iterate through the array
        for (int i = 0; i < nums.length - 1; i++) {
            // Create a set to store the complements
            Set<Integer> set = new HashSet<>();

            // Iterate through the array starting from the next element of i
            for (int j = i + 1; j < nums.length; j++) {
                // Calculate the complement of nums[i] and nums[j] to reach zero
                int complement = -nums[i] - nums[j];

                // Check if the complement is already in the set
                if (set.contains(complement)) {
                    // If found, create a list to store the triplet
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(complement);
                    list.add(nums[i]);
                    list.add(nums[j]);

                    // Sort the list to ensure unique representation of the triplet
                    Collections.sort(list);

                    // Add the sorted triplet to the result set
                    result.add(list);
                }

                // Add the current number to the set
                set.add(nums[j]);
            }
        }

        // Convert the set to a list and return
        return new ArrayList<>(result);
    }
}




// Time Complexity : O(n*n)
// Space Complexity :O(1) considering result is not an extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Sort input array

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the array to enable the two-pointer approach
        Arrays.sort(nums);

        // Initialize the list to store the result triplets
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through the array, treating each element as a potential left element of the triplet
        for (int left = 0; left < nums.length; left++) {
            // If the current element is greater than 0, break out of the loop
            // Since the array is sorted, no three numbers can sum to 0 beyond this point
            if (nums[left] > 0) break;

            // Skip duplicate elements to avoid duplicate triplets in the result
            if (left > 0 && nums[left] == nums[left - 1]) continue;

            // Initialize two pointers: mid (next element after left) and right (last element)
            int mid = left + 1;
            int right = nums.length - 1;

            // Use the two-pointer technique to find pairs that sum to the negative value of nums[left]
            while (mid < right) {
                // Calculate the sum of the current triplet
                int sum = nums[left] + nums[mid] + nums[right];

                if (sum == 0) {
                    // If the sum is 0, we found a valid triplet
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[left]);
                    temp.add(nums[mid]);
                    temp.add(nums[right]);
                    result.add(temp);

                    // Move both pointers to look for other potential pairs
                    mid++;
                    right--;

                    // Skip duplicate elements to avoid duplicate triplets in the result
                    while (mid < right && nums[mid] == nums[mid - 1]) mid++;
                    while (mid < right && nums[right] == nums[right + 1]) right--;
                } else if (sum > 0) {
                    // If the sum is greater than 0, move the right pointer left to reduce the sum
                    right--;
                } else {
                    // If the sum is less than 0, move the mid pointer right to increase the sum
                    mid++;
                }
            }
        }

        // Return the list of triplets
        return result;
    }
}
