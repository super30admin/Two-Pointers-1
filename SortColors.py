class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # Just like in Quicksort Algorithm, maintain three pointers, low for zeros, mid for 1s and high for 2s. 
        # Time Complexity is O(n)
        # Space Complexity is O(1)
        low = 0
        mid = 0
        high = len(nums)-1
        while(mid <= high):
            if(nums[mid] == 1):
                mid+=1
            elif(nums[mid] == 0):
                nums[low],nums[mid] = nums[mid],nums[low]
                low+=1
                mid+=1
            else:
                nums[mid],nums[high] = nums[high],nums[mid]
                high-=1