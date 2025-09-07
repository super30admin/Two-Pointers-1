## Problem1 (https://leetcode.com/problems/sort-colors/)


# Method1: Using count sort
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# We count the zeros, ones and twos. Then within the same array we place the zeros, ones and twos in order based on their count.
# This is a two pass algorithm

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # using count sort
        count0s = 0
        count1s = 0
        count2s = 0

        for i in nums:
            if(i == 0):
                count0s += 1
            elif(i == 1):
                count1s += 1
            else:
                count2s += 1

        i = 0
        while(count0s > 0):
            nums[i] = 0
            i += 1
            count0s -= 1

        while(count1s > 0):
            nums[i] = 1
            i += 1
            count1s -= 1

        while(count2s > 0):
            nums[i] = 2
            i += 1
            count2s -= 1

sol = Solution()
print("Method1: Using count sort")
nums = [2, 2, 1, 0, 1, 1, 0, 1, 2]
sol.sortColors(nums)
print(nums)
nums = [2,0,2,1,1,0]
sol.sortColors(nums)
print(nums)
nums = [2,0,1]
sol.sortColors(nums)
print(nums)
nums = [0]
sol.sortColors(nums)
print(nums)
nums = [1]
sol.sortColors(nums)
print(nums)
nums = [2]
sol.sortColors(nums)
print(nums)



# Method2: Using three pointers
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Using three pointers. Left pointer is to catch the 0s, right pointer is to catch 2s. Mid pointer is to move through the array to
# distribute 0s to the left and 2s to the right. This is a single pass algorithm


class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # keep 3 pointers one to left, right and mid
        # left is to catch the 0 ie red color
        # right is to catch the 2 ie blue color
        # mid is moving pointer distributing 0s and 2s and by passing 1s

        left = 0
        right = len(nums) - 1
        mid = 0

        while(mid <= right):
            if(nums[mid] == 2):
                # swap with right element and decrement right
                temp = nums[right]
                nums[right] = nums[mid]
                nums[mid] = temp
                right -= 1
            elif(nums[mid] == 0):
                # swap with left element and increment left
                # there will never be a case where 2 will come from left
                # 2 would already be sent to the right
                # either 1 will come or 0. so we can increment mid and left
                temp = nums[left]
                nums[left] = nums[mid]
                nums[mid] = temp
                left += 1
                mid += 1
            else:
                # when nums[i] == 1
                mid += 1


sol = Solution()
print("Method2: Using three pointers")
nums = [2, 2, 1, 0, 1, 1, 0, 1, 2]
sol.sortColors(nums)
print(nums)
nums = [2,0,2,1,1,0]
sol.sortColors(nums)
print(nums)
nums = [2,0,1]
sol.sortColors(nums)
print(nums)
nums = [0]
sol.sortColors(nums)
print(nums)
nums = [1]
sol.sortColors(nums)
print(nums)
nums = [2]
sol.sortColors(nums)
print(nums)