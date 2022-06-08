# Time Complexity: O(n)
# Space Complexity: O(1)
  
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        r = 0
        w = 0
        b = 0
        
        for num in nums:
            if num == 0:
                r += 1
            elif num == 1:
                w += 1
            else:
                b += 1
        i = 0
        while r > 0:
            nums[i] = 0
            r -= 1
            i += 1
        
        while w > 0:
            nums[i] = 1
            w -= 1
            i += 1
        
        while b > 0:
            nums[i] = 2
            b -= 1
            i += 1
        
