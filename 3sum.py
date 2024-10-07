class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        """
        Finds all unique triplets in the array that sum to zero.
        """
        res = []
        n = len(nums)
        nums.sort()

        for i in range(n):
            # Skip duplicate values to avoid duplicate triplets
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            # If the current number is positive, break, as further numbers can't sum to zero
            if nums[i] > 0:
                break

            low, high = i + 1, n - 1
            while low < high:
                sum = nums[i] + nums[low] + nums[high]
                if sum == 0:
                    # If the sum is zero, add the triplet to the result list
                    res.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1

                    while low < high and nums[low] == nums[low - 1]:
                        low += 1

                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                elif sum < 0:
                    # If the sum is less than zero, increment low pointer to increase the sum
                    low += 1
                else:
                    # If the sum is greater than zero, decrement high pointer to decrease the sum
                    high -= 1

        return res


# time complexity:O(n^2)
# space complexity:O(n)
