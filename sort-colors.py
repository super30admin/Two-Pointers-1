''' Time Complexity : O(n) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No


   Approach : Use 3 pointers, 1 for collecting 0, one for collecting 2, and mid to iterate array
              swap the elements so that, 0s are at left, 2s are at right and 1s are at the middle

'''

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        l, mid, r = 0, 0 , n-1
        def swap(nums, x, y):
            temp = nums[x]
            nums[x] = nums[y]
            nums[y] = temp
            
        while mid <= r:
            if nums[mid] == 2:
                swap(nums,mid,r)
                r -= 1
            elif nums[mid] == 0:
                swap(nums,mid,l)
                l += 1
                mid += 1
            else:
                mid += 1
        