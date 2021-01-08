class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        
        output = []
        
        for pivot in range(len(nums)):
            if pivot > 0 and nums[pivot] == nums[pivot - 1]:
                continue
            low = pivot + 1
            high = len(nums) - 1
            
            while low < high:
                total = nums[pivot] + nums[low] + nums[high]
                if total == 0:
                    output.append([nums[pivot], nums[low], nums[high]])
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
                    
        return output
 # Time - O(n2)
 #Space - O(1)