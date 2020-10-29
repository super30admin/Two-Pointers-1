# Time Complexity:- O(n)
# Space Complexity:- O(1)
# Approach:- Use two pointer one at the start and another which starts from the end. Use a greedy approach where i decide that
# if the number at start<number at the end, I make a greedy choice that i can probably find a better start(thus increasing my area)
#  so i increase start pointer else I decrease end pointer.
import sys

class Solution:
    def maxArea(self, nums: List[int]) -> int:
        i=0
        j=len(nums)-1
        res=-sys.maxsize
        while(i<j):
            res=max(res,min(nums[i],nums[j])*(j-i))
            if nums[i]<nums[j]:
                i+=1
            else:
                j-=1
        return res