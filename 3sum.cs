// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

IList<IList<int>> result = new List<IList<int>>();

        // Step 1: Sort the array
        Array.Sort(nums);

        // Step 2: Loop through the array
        for (int i = 0; i < nums.Length - 2; i++) {
            // Avoid duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.Length - 1;
            int target = -nums[i];  // We are looking for two numbers that sum to -nums[i]

            // Step 3: Use two pointers to find the two numbers that sum to the target
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    // We found a triplet
                    result.Add(new List<int> { nums[i], nums[left], nums[right] });

                    // Move both pointers to skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;  // Move left pointer right to increase the sum
                } else {
                    right--; // Move right pointer left to decrease the sum
                }
            }
        }

        return result;