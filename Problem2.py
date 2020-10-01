# Time Complexity: O(N^2)
# Space Complexity: O(N)
# Pass leetcode.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        nums.sort()
        out = []
        for i in range(len(nums) - 2):
            
            if i > 0 and nums[i - 1] == nums[i]:
                    continue
            left = i + 1
            right = len(nums) - 1
            
            while left < right:

                total = nums[i] + nums[left] + nums[right]
                if total == 0:
                    out.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1  
                    
                # elif total < 0 and nums[left] > 0:
                #     break
                elif total < 0:
                    left += 1
                else:
                    right -= 1
                
        
        return out
                
                