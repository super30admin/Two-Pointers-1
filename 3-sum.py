"""
Runtime Complexity: O(n^2) + O(n logn). Because we have a for and while loop nested and this performs n^2 operations. We also sort the given input which takes O(n logn) for 'n' elements.
The dominating time here is O(n^2). Therefore the overall time complexity is O(n^2).
Space Complexity:O(1)- no extra space was used to compute the solution.
Yes, the code worked on leetcode.
The idea behind the algorithm is to sort the given list and iterate over them. We set the left as i+1 and right as n-1. We compute the sum by add nums[left]+nums[i]+nums[right].
We check if sum is less than 0 then we increment the left else we decrement the right. Finally we return the result.
"""


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums)==0:
            return
        nums = sorted(nums)
        result = []
        for i in range(0,len(nums)-1):
            if i>0 and nums[i] == nums[i-1]:
                continue
            if nums[i]>0:
                break
            left = i+1
            right = len(nums)-1
            while left<right:
                sum = nums[left]+nums[i]+ nums[right]
                
                if sum>0:
                    right-=1
                
                
                elif sum<0:
                    left+=1
                    
                
                else:
                    result.append([nums[left],nums[i],nums[right]])
                    left+=1
                    right-=1
                    
                    while(left<right and nums[left]==nums[left-1]):
                        left+=1
                    while(left<right and nums[right]== nums[right+1]):
                        right-=1
        return result
                    
                
        