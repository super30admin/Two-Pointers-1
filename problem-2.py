# // Time Complexity : O(n*logn) + O(n^2)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


from typing import List
def threeSum(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """
    res = []
    nums.sort()
    
    
    
    for i in range (0, len(nums)):
        
        if i > 0 and (nums[i] == nums[i-1]):
                continue
        
        l, r = i+1, len(nums) - 1
        
        while l < r:

            curSum = nums[i] + nums[l] + nums[r]
            
            if curSum > 0:
                r-=1
            elif curSum < 0:
                l+=1
            else:
                res.append([nums[i], nums[l], nums[r]])
                l+= 1
                while nums[l] == nums[l-1] and l<r:
                    l+=1
                
    return res

nums = [-1,0,1,2,-1,-4]

print(threeSum(nums))

