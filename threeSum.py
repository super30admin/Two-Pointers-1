# Time Complexity: O(n^2)
# Space Complexity: O(1)


class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        nums.sort()

        for i, num in enumerate(nums):
            if nums[i]>0:
                break
            elif i > 0 and nums[i] == nums[i-1]:
                continue
            else:
                left = i+1
                right = len(nums)-1

                while (left < right):
                    sum = num + nums[left] + nums [right]

                    if sum < 0:
                        left += 1
                    elif sum > 0:
                        right -= 1
                    else:
                        res.append([num, nums[left], nums[right]])
                        left += 1
                        while ((left < right) and nums [left] == nums[left-1]):
                            left += 1
        return res
