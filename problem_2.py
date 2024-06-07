# Time complexity O(NLogN)
# Space Complexity O(1) 
# Not using any extra space apart from the return list
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return []
        result = []
        nums.sort()
        
        for start in range(len(nums) - 2):
            if start > 0 and nums[start] == nums[start - 1]:
                continue
            left, right = start + 1, len(nums)-1
            while left < right:
                tsum = nums[start] + nums[left] + nums[right]
                if tsum == 0:
                    result.append([nums[start], nums[left], nums[right]])
                    
                    # skip duplicate 
                    while left < right and nums[left] == nums[left+1]:
                        left += 1
                    while left < right and nums[right] == nums[right-1]:
                        right -= 1
                    left += 1
                    right -= 1
                elif tsum > 0:
                    right -= 1
                else:
                    left +=1
        return result



        