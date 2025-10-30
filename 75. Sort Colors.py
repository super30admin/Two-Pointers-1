# Sort the 3 colors the colors are represented by 0,1 and 2

# Time: O(nlogn)
# Space: O(1)
# Use quick sort or sorting algorithm
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        return nums.sort()
    
# Time: O(n) => 2 pass
# Space: O(1)
# maintain a counter for 0, 1 and 2 seperately and then add the elements accordingly in the nums array
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count_0 = 0
        count_1 = 0
        count_2 = 0

        for num in nums:
            if num == 0:
                count_0 += 1
            elif num == 1:
                count_1 += 1
            else:
                count_2 += 1

        idx = 0
        for i in range(count_0):
            nums[idx] = 0
            idx += 1
        for i in range(count_1):
            nums[idx] = 1
            idx += 1
        for i in range(count_2):
            nums[idx] = 2
            idx += 1


# DUTCH FLAG ALGORITHM

# Time: O(n) => Single pass
# Space O(1) => In place
# Have 3 pointers for 3 numbers low(for 0), mid(for 1), and high(for 2)
# while mid <= high and mid >= low but mid is never going to cross low because we increment both of them together or we increment just mid
# If we get 2 at the mid position swap it with high and decrement the high pointer cause that's where we want to put next 2
# If we get 0 at the mid position swap it with low and increment both mid and low
# The reason we increment mid is that we can never have 2 before mid because we check for it and if we don't move mid with low then the low might get ahead of mid if mid == 0 and we migh end up putting 0 at low which can be ahead of mid i.e ahead of 1
# and at last if we encounter 1 just increment the mid pointer

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1

        while mid <= high:
            if nums[mid] == 2:
                temp = nums[high]
                nums[high] = nums[mid]
                nums[mid] = temp
                high -= 1
            elif nums[mid] == 0:
                temp = nums[low]
                nums[low] = nums[mid]
                nums[mid] = temp
                low += 1
                mid += 1
            else:
                mid += 1