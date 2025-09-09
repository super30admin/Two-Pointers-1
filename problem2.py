"""
Space Complexity: O(1) No extra memory
Time Complexity: O(N^2 + NlogN ~ N^2) 
"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = []
        N = len(nums)

        for i in range(N): 
            if i > 0 and nums[i] == nums[i-1]: continue
            left = i+1
            right = N - 1

            while left < right: 
                if nums[left] + nums[right] + nums[i] == 0: 
                    ans.append((nums[i], nums[left], nums[right]))
                    left+=1
                    right-=1
                    while left < right and nums[left] == nums[left-1]: left +=1
                    while left < right and nums[right] == nums[right+1]: right-=1
                elif nums[left] + nums[right] + nums[i] > 0: 
                    right -=1
                else: 
                    left+=1
        return ans



            



