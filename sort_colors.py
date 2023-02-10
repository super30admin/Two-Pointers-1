# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums)==0: # checking null condition
            return
        low = 0
        mid = 0
        high = len(nums) - 1
    
        def swap(nums, i, j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp

        while (mid <= high): # running the loop till mid does not exceed high, since low will always be behind the mid we dont use low < high
            if nums[mid] == 2: # checking if mid is equal to 0,1,2 if 0 then we swap elements of mid and low and increment both 
                swap(nums, mid, high) # for mid = 2 we swap elements of mid and high and decrement high, and else we just increment mid when found 1
                high -= 1
            elif nums[mid] == 0:
                swap(nums, mid, low)
                low += 1
                mid += 1
            else:
                mid += 1
        return nums