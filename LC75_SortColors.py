"""
We will maintain 3 pointers p0 at the start, p2 at the end and a curr pointer
for every 0 at curr pointer, we swap it with p0 and move both curr and p0 ahead
for every 2 at curr, we swap it with p2 and move p2 behind
for a 1 we move curr ahead

TC = O(n)
SC = O(1)

"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p0= 0
        curr = 0
        p2 = len(nums)-1
        
        while curr<=p2:
            if nums[curr]==0:
                nums[p0],nums[curr]=nums[curr], nums[p0]
                p0+=1
                curr+=1
            elif nums[curr]==2:
                nums[curr], nums[p2]= nums[p2], nums[curr]
                p2-=1
            else:
                curr+=1
            
       
        
        