class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #Time Complexity: O(n^2)
        #Space Complexity: O(1)
        #where, n is the length of nums
        
        nums.sort()
        result = []
        
        for pivot in range(len(nums)):
            if pivot > 0 and nums[pivot] == nums[pivot - 1]:
                continue
            low = pivot + 1
            high = len(nums) - 1
            
            while low < high:
                total = nums[pivot] + nums[low] + nums[high]
                if total == 0:
                    result.append([nums[pivot], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                
                elif total < 0:
                    low += 1
                
                else:
                    high -= 1
                    
        return result