class Solution(object):
    def threeSum(self, nums):
        """
        Time complexity: O(n^2)
        Space complexity: O(n)
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = []  # List to store the triplets
        n = len(nums)  # Length of the input list
        nums.sort()  # Sort the input list in ascending order

        for i in range(0, n - 2):
            if nums[i] > 0:
                break  # If the current number is positive, there won't be any triplet that sums to zero
            if i > 0 and nums[i] == nums[i - 1]:
                continue  # Skip duplicate numbers to avoid duplicate triplets

            l = i + 1  # Left pointer
            r = n - 1  # Right pointer

            while l < r:
                # Calculate the sum of the three numbers
                sum = nums[i] + nums[l] + nums[r]

                if sum == 0:  # If the sum is zero, we found a valid triplet
                    triplet = [nums[i], nums[l], nums[r]]  # Create the triplet
                    # Add the triplet to the result list
                    result.append(triplet)
                    l += 1  # Move the left pointer to the right
                    r -= 1  # Move the right pointer to the left

                    # Skip duplicate numbers to avoid duplicate triplets
                    while l < r and nums[l] == nums[l - 1]:
                        l += 1
                    while l < r and nums[r] == nums[r + 1]:
                        r -= 1

                elif sum > 0:  # If the sum is greater than zero, move the right pointer to the left
                    r -= 1
                else:  # If the sum is less than zero, move the left pointer to the right
                    l += 1

        return result  # Return the list of triplets
