#TC: O(n^2)
#SC: O(1)
#This code compiled in LC successfully
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        res = []
        nums.sort()  # Sort in place

        for i in range(n):
            # Skip duplicate elements for `i`
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            # Stop if the current element is positive
            if nums[i] > 0:
                break

            left, right = i + 1, n - 1
            while left < right:
                total = nums[i] + nums[left] + nums[right]
                if total == 0:
                    res.append([nums[i], nums[left], nums[right]])
                    
                    # Move pointers and skip duplicates
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
                
                elif total > 0:
                    right -= 1
                else:
                    left += 1

        return res
