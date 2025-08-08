# Approach: Two Pointers - l collects 0s and m collects 1s, h collects 2s.
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def swap(nums,m,value):
            temp = nums[m]
            nums[m] = nums[value]
            nums[value]=temp
        
        l,m,h = 0,0,len(nums)-1
        while m<=h:
            if nums[m]==2:
                swap(nums,m,h)
                h-=1
            elif nums[m]==0:
                swap(nums,m,l)
                l+=1
                m+=1
            else:
                m+=1
        