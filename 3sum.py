# Time complexity: O(nlogn + n ^ 2)
# Space complexity: O(1)

# The code successfully ran on leetcode

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)        
        result = list()
        nums.sort()
        
        for i in range(n):
            if i > 0 and nums[i] == nums[i - 1]: 
                continue
            if nums[i] > 0: 
                break
            left = i + 1
            right = n - 1
            
            print(i, left, right)
            
            while left < right:
                sums = nums[i] + nums[left] + nums[right]
                
                if sums == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
                    
                elif sums < 0:
                    left += 1
                    
                else:
                    right -= 1
                    
        return result
                