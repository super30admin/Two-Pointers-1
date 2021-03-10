"""
TC: O(n)
SC: O(1) const space
Leetcode: Success!
Problems: While condiction, but corrected!
"""
class Solution:
    def sortColors(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # Sanity Check
        if nums ==None or len(nums)==0:
            return []
        if len(nums)==1:
            return nums
        low = 0
        mid = low
        high = len(nums)-1
        while mid <= high:
            if nums[mid] == 2:
                nums[mid],nums[high] = self.swap(nums[mid],nums[high])
                high -=1
            elif nums[mid] == 0:
                nums[mid],nums[low] = self.swap(nums[mid],nums[low])
                low += 1
                mid += 1
            elif nums[mid]==1:
                mid += 1
        return nums

    def swap(self, a,b):
        temp = 0
        temp = a
        a = b
        b = temp
        return a,b

s = Solution()

nums = [2,0,2,1,1,0]
nums = [2,0,1]
# nums = [1,0,1,0,2,0,1,0,1]
"""
nums = [0]
nums = [1]
nums = []
"""
print("\nsorted: ",s.sortColors(nums))
