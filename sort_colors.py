# -*- coding: utf-8 -*-
"""
TC : O(N) where N is the length of array given
SC: O(1) as we are not using any extra space
"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        #edge case
        if not nums or len(nums) == 0:
            return -1
        
        l = 0 
        m = 0 
        h = len(nums) - 1
        
        while m <= h:#traverse the entire array
            #check for case m = 1
            if nums[m] == 1:
                m += 1  #increment mid pointer
            #check for case m = 2
            elif nums[m] == 2:
                self.swap(nums,m,h) #swap mid with high pointer
                h -= 1
            #for case m = 0
            else:
                self.swap(nums,m,l)#swap contents of mid and low
                l += 1 #increment low and mid
                m += 1
    
    def swap(self,nums: List[int],a :int,b: int): #function to swap elements
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp