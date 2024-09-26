# Time Complexity : O(NlogN)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        output = []
        for i in range(n-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            x = nums[i]
            
            target = -1*x
            j = i+1
            k = len(nums) -1
            while j < k:
                
                    
                if nums[j] + nums[k] == target:
                    
                    triplet = [nums[j],nums[k],nums[i]]
                    
                    output.append(triplet)
                    j = j+1
                    while j < k and nums[j] == nums[j-1]:
                        j = j+1
                    k = k-1
                elif nums[j] + nums[k] < target:
                    j = j+1
                else:
                    k = k-1
                  
        return output
        