class Solution:
    def threeSum(self, nums):
        nums.sort()
        res = []

        for i in range(len(nums) - 2):

            # Skip duplicate first elements
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            left = i + 1
            right = len(nums) - 1

            while left < right:
                total = nums[i] + nums[left] + nums[right]

                if total < 0:
                    left += 1

                elif total > 0:
                    right -= 1

                else:
                    res.append([nums[i], nums[left], nums[right]])

                    left += 1
                    right -= 1

                    # Skip duplicate second elements
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1

                    # Skip duplicate third elements
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1

        return res

    # TC - O(n^2)
    # SC - O(1)