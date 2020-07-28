# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
            
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i != 0 and nums[i] == nums[i-1]:
                continue
                
            j = i+1
            k = len(nums) - 1
            
            while j < k:
                temp = nums[i] + nums[j] + nums[k]
                
                if temp > 0:
                    k -= 1
                elif temp < 0:
                    j += 1
                else:
                    result.append([nums[i], nums[j], nums[k]])
                    j+=1
                    k-=1
                    while j<k and nums[j] == nums[j-1]:
                        j += 1
                    while j<k and nums[k+1] == nums[k]:
                        k -= 1
                    
            i+=1
                    
        return result