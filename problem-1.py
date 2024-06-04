# Time Complexity
# O(n)
# Space Complexity
# O(1)


# Approach :

# use 3 pointers left, mid and right
# traverse the array, if zero is seen, swap between the left and mid pointer and increment both
# if 1 is seen, increment mid only
# if 2 is seen, swap between mid and right element, and decrement right pointer

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return None

        left = 0
        mid = 0
        lenNums = len(nums)
        right = lenNums-1

        while (mid <= right):

            if (nums[mid] == 0):

                t = nums[left]
                nums[left] = nums[mid]
                nums[mid] = t
                left = left+1
                mid = mid+1

            elif (nums[mid] == 2):

                t = nums[right]
                nums[right] = nums[mid]
                nums[mid] = t
                right = right-1

            else:
                mid = mid+1

        return nums
