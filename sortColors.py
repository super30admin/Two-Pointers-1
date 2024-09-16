# Time complexity: O(N)
# Space complexity: O(1) 
# Compiled in leetcode? Yes
# Difficulties faced: Didnt provide while condition correctly (put index < len(nums) instead of end), so I was getting wrongly sorted results
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        start = 0
        end = len(nums) - 1
        index = 0
        
        while start < end and index <= end:
            if nums[index] == 0 :
                nums[index] = nums[start]
                nums[start] = 0
                start+= 1
                index+=1
            elif nums[index] == 2:
                nums[index] = nums[end]
                nums[end] = 2
                end -= 1
            else:    
                index+=1    
        return nums       