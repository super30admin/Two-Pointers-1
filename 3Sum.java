
/*
* Approach: 
*   - Sort the array so we can use two-pointer technique efficiently.
*   - For each element nums[i], we look for two other numbers that sum to -nums[i].
*   - Use a left (low) and right (high) pointer to find valid triplets.
*   - Skip duplicates for both i, low, and high to ensure unique triplets.
*
* Time Complexity:  O(n^2) — for each number, we use two pointers to scan the rest.
* Space Complexity: O(1) — no extra space used besides the output list.
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        // Iterate through each element, treating it as the first number in the triplet
        for (int i = 0; i < n; i++) {

            // Skip duplicates for the first element to avoid repeated triplets
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            //since array is sorted, if current number > 0, then all numbers after it are also > 0 and cannot sum to 0
            if (nums[i] > 0) break;

            int low = i + 1;       // left pointer
            int high = n - 1;      // right pointer

            // Two-pointer search for remaining two numbers
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    // Move both pointers inward
                    low++;
                    high--;

                    // Skip duplicate values on the left
                    while (low < high && nums[low] == nums[low - 1]) low++;

                    // Skip duplicate values on the right
                    while (low < high && nums[high] == nums[high + 1]) high--;

                } else if (sum > 0) {
                    // Sum too large -> decrease it by moving right pointer left
                    high--;
                } else {
                    // Sum too small -> increase it by moving left pointer right
                    low++;
                }
            }
        }

        return result;
    }
}