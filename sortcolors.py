# TC:O(n) Time Complexity
# SC:O(1) Space Complexity

class Solution(object):

    def sortColors(self, nums):
        if (nums == None or len(nums) == 0):
            return

        low = 0
        mid = 0
        high = len(nums) - 1

        while (mid <= high):   
            if (nums[mid] == 2):    
                self.__swap(nums, mid, high)
                high -= 1
            elif (nums[mid] == 1):     
                mid += 1
            else:                        
                self.__swap(nums, low, mid)
                mid += 1
                low += 1

        return

    def __swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp