#  https://leetcode.com/problems/sort-colors/

# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
# The while (mid <= r) loop runs until the mid pointer crosses r
# When encountering 0, it swaps with the left pointer (l), and both l and mid are incremented.
# When encountering 2, it swaps with the right pointer (r), and r is decremented
# When encountering 1, only mid is incremented.


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        l = 0
        r = n - 1
        mid = 0
        while(mid <= r):
            if(nums[mid]== 2):
                self.swap(nums,mid,r)
                r-=1
            elif(nums[mid] == 0):
                self.swap(nums,mid,l)
                l+=1
                mid+=1
            else:
                mid+=1
    
    def swap(self, nums: List[int], mid: int, no: int) ->None:
        temp = nums[mid]
        nums[mid] = nums[no]
        nums[no] = temp