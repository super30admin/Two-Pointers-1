# Time complexity: O(N^2)
# Space complexity: O(1)
# Compiled on leetcode? : Yes
# Difficulties faced?: No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i -1]:
                continue
            start = i + 1
            end = len(nums) - 1
            while start < end:
                total = nums[i] + nums[start] + nums[end]
                if total == 0:
                    result.append([nums[i], nums[start], nums[end]])
                    start += 1
                    end -= 1
                    while start < end and nums[end] == nums[end + 1]:
                        end -= 1
                    while start < end and nums[start] == nums[start - 1]:
                        start += 1
                elif total > 0:
                    end -= 1
                else:
                    start+= 1
        return result            
                    
        