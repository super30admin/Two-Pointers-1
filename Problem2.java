//Time = O(n)
//space = O(n)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Initialize an empty list to store the triplets
        List<List<Integer>> triplets = new ArrayList<>();

        // Sort the input array in non-decreasing order
        Arrays.sort(nums);

        // Loop through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates of the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Set the left and right pointers
            int left = i + 1;
            int right = nums.length - 1;

            // Loop through the remaining elements using two pointers
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    // If the sum is less than zero, move the left pointer
                    left++;
                } else if (sum > 0) {
                    // If the sum is greater than zero, move the right pointer
                    right--;
                } else {
                    // If the sum is zero, add the triplet to the list
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    triplets.add(triplet);

                    // Skip duplicates of the second and third elements
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move the left and right pointers to the next unique elements
                    left++;
                    right--;
                }
            }
        }

        return triplets;
    }
}
