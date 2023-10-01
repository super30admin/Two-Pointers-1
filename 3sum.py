#Time complexity: O(N^2)
#Space complexity:O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        final_result = []  # This list will store the final result, which is a list of unique triplets.
        nums_sorted = sorted(nums)  # Sort the input array nums in ascending order.
        target = 0  # The target sum we want to achieve (0 in this case).

        # Iterate through the sorted array, considering each element as the first element of a triplet.
        for index in range(len(nums_sorted) - 2):
            # Skip duplicate elements as the first element of a triplet to avoid duplicate triplets.
            if index > 0 and nums_sorted[index] == nums_sorted[index - 1]:
                continue

            left, right = index + 1, len(nums_sorted) - 1  # Initialize two pointers, left and right.

            while left < right:
                current_sum = nums_sorted[index] + nums_sorted[left] + nums_sorted[right]

                if current_sum == target:
                    # If the current triplet sums to the target, add it to the final result.
                    final_result.append([nums_sorted[index], nums_sorted[left], nums_sorted[right]])
                    left += 1
                    right -= 1

                    # Skip duplicate elements for both left and right pointers.
                    while left < right and nums_sorted[left] == nums_sorted[left - 1]:
                        left += 1
                    while left < right and nums_sorted[right] == nums_sorted[right + 1]:
                        right -= 1

                elif current_sum < target:
                    left += 1  # If the sum is less than the target, move the left pointer to the right.
                else:
                    right -= 1  # If the sum is greater than the target, move the right pointer to the left.

        return final_result  # Return the list of unique triplets that sum to 0.
