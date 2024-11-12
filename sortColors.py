# // Time Complexity :O(n) for traversal
# // Space Complexity :O(1) done inside nums array
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        low = 0
        high = n-1
        #[2,0,2,1,1,0] m = 0, l = 0, h = 5 swap 2 w 0
        #[0,0,0,1,1,2] m = 1, l = 0, h = 4 swap 0 w 0
        #[0,0,2,1,1,2] m = 2, l = 2, h = 4 swap 2 w 1
        #[0,0,1,1,2,2] m = 2, l = 2, h = 4 swap 2 w 1
            
        # we want to seperate 0 to left ans 2 to right
        while mid <= high:
            mid = low
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high],nums[mid] # swap
                high -=1                                     # move only right pointer
            elif nums[mid] == 0:
                nums[mid],nums[low] = nums[low],nums[mid]    # swap
                low +=1                                      # move both pointers
                mid +=1
            else:                                            # if nums[mid] == 1 just increment mid
                mid +=1                 




        
        


        
        