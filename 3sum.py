# Time Complexity : O(n^2), where n is the length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : yes, but dry running the code helped.

# Your code here along with comments explaining your approach
class Solution(object):
    # maintaining three pointers, for every element in the array set two pointers
    # left at the right neighbor of i and the other at the last elem in array.
    # for every element move the two pointers accordingly to find the summation of the
    # three to be 0 and adding them to a list, while also avoiding duplicates at any point
    def threeSum(self, nums):
        if not nums or len(nums) < 3:
            return []

        nums.sort()
        retVal, n = set(), len(nums)

        for i in range(n-2):
            # no need to check for any i greater than 0 and because array is sorted, break.
            if nums[i] > 0:
                break
            # avoiding duplicates at i pointer
            elif i > 0 and nums[i] == nums[i - 1]:
                continue
            # init of the two pointers and movement according to cases.
            low, high = i+1, n-1
            while low < high:
                summ = nums[i] + nums[low] + nums[high]
                if summ == 0:
                    retVal.add((nums[i], nums[low], nums[high]))
                    low += 1
                    high -= 1
                    # skipping duplicates at low and high pointers
                    while low < high and nums[low] == nums[low-1]:
                        low += 1
                    while low < high and nums[high] == nums[high+1]:
                        high -= 1
                elif summ < 0:
                    low += 1
                else:
                    high -= 1

        return list(retVal)



print(Solution().threeSum([-1, 0, 1, 2, -1, -4]))
