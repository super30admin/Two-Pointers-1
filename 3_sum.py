# TC: O(N^2)
# SC :O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        final_result = []
        nums_sorted = sorted(nums)
        target = 0
        
        for index in range(len(nums_sorted)-2):
            if index > 0 and nums_sorted[index] == nums_sorted[index-1]:
                continue
            
            left, right = index + 1, len(nums_sorted) - 1
            
            while left < right:
                current_sum = nums_sorted[index] + nums_sorted[left] + nums_sorted[right]
                
                if current_sum == target:
                    final_result.append([nums_sorted[index], nums_sorted[left], nums_sorted[right]])
                    left += 1
                    right -= 1
                    
                    while left < right and nums_sorted[left] == nums_sorted[left-1]:
                        left += 1
                    while left < right and nums_sorted[right] == nums_sorted[right+1]:
                        right -= 1
                        
                elif current_sum < target:
                    left += 1
                else:
                    right -= 1
        
        return final_result
