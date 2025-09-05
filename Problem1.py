class Solution(object):
        # tc: O(n)
        # sc : O(1)
        # ran successfuly in leetcode
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # optimized approach
        # lets consider index 0- low (color 0), low-mid (color 1), mid-high (color 2)
        # so it gets sorted accordingly 
        
        low = 0
        mid = 0
        high = len(nums)-1

        while (mid <= high):
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low +=1
                mid +=1
            elif nums[mid] == 1:
                mid +=1
            else :
                nums[high], nums[mid] = nums[mid], nums[high]
                high -=1

        return nums


