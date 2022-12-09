# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


class solution:
    def sort(self, nums):

        low = 0
        mid = 0
        high = len(nums)-1
        ## we are solving this in place . we start with 3 pointer. mid low and high. our mid pointer is the 
        ## moving pointer and deciding factor. 
        ## low pointers are used to store 0 , high are used to store 2, once 0 and 2 are done the remaining will be 
        ## 1 which will be center. if mid == 0 we swap it with low and increment both mid and low. if mid ==2 
        ## we swap it with high and move high towards left. we do not move mid because we dont know if thswapped elemnt from 
        ## high is 1 or 0 . else if mid ==1 then we just move mid ahead. 
        while mid <= high:

            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high-=1
            
            elif nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low+=1
                mid+=1
            else:
                mid+=1
        