# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : understanding the intuituon 


# // Your code here along with comments explaining your approach
# idea is to have 3 pointers that keep track of 0s 1s and 2s using l, mid and h pointer
# we move mid until we see a 1 
# we move low and mid and swap with l until we see 0 we need to move mid otherwise low can cross mid
# similary we move high to left and swap with mid until we see 2

from typing import List
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        l,mid,h=0,0,len(nums)-1
        while(mid<=h):
            if nums[mid] == 1:
                mid+=1
            elif nums[mid] == 2:
                nums[h],nums[mid] = nums[mid],nums[h]
                h-=1
            else:
                nums[l], nums[mid] = nums[mid], nums[l]
                l+=1
                mid+=1
        """
        Do not return anything, modify nums in-place instead.
        """
        