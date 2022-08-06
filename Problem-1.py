#  75. Sort Colors
'''
Leetcode all test cases passed: Yes
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        n is the length of nums
        Space Complexity: O(1)
        Time Complexity: O(n)
'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
        r = len(nums) - 1
        curr = 0
        
        while curr < r:
            if curr < l:
                curr = l 
            elif nums[r] == 0:
                nums[l],nums[r] = nums[r],nums[l]
                l += 1
            elif nums[l] == 0:
                l += 1
            elif nums[r] == 2:
                r -= 1
            elif nums[curr] == 1:
                curr += 1
                
            elif nums[curr] == 0:
                if curr !=  l:
                    nums[l],nums[curr] = nums[curr],nums[l]
                    l += 1
                else:
                    curr += 1
                    l += 1
                   
            elif nums[curr] == 2:
                nums[r],nums[curr] = nums[curr],nums[r]
                r -= 1
        return nums
                
