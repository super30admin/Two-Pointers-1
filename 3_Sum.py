# Time Complexity : O(N2)
# Space Complexity : O(1)x
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# I have sorted the array and used two pointers left and right and keeping i pointer to iterate over the array.
# Using three pointers i, left and right
# If the sum == 0, append to arraylist and increment left pointer and decrement right pointer. 
# Also for the duplicates we just move left and right pointer if left == left - 1 and right == right - 1
# If the sum > 0, decrement right pointer
# If the sum < 0, increment left pointer

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        result = set()
        for i in range(len(nums)):
            numsSet = set()
            for j in range(i+1, len(nums)):
                comp = 0 - (nums[i] + nums[j])
                if comp in numsSet:
                    sortedTriplet = sorted([comp, nums[i], nums[j]])
                    result.add(tuple(sortedTriplet))
                numsSet.add(nums[j])
        output = []

        for x in result:
            output.append(list(x))
#Time - O(N2)
#Space - O(N)

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        result = []
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            left = i + 1
            right = len(nums)-1
            while left < right:
                target = nums[i] + nums[left] + nums[right]
                if target == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left-1]:
                        left += 1
                    while left < right and nums[right] == nums[right+1]:
                        right -= 1
                elif target < 0:
                    left += 1
                else:
                    right -= 1
        return result
#Time - O(N2)
#Space - O(1)