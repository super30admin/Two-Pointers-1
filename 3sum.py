# Time Complexity : O(N^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums):
        if len(nums)==0:
            return []
        ans = []
        n = len(nums)
        nums.sort()
        
        for i in range(n):
            if i!=0 and nums[i]==nums[i-1]:
                continue
            left = i+1
            right = n-1
            while(left<right):
                sum = nums[i]+nums[left]+nums[right]
                if sum==0:
                    ans.append([nums[i],nums[left],nums[right]])
                    left+=1
                    right-=1
                    while(left<right and nums[left]==nums[left-1]):
                        left+=1
                    while(left<right and nums[right]==nums[right+1]):
                        right-=1
                elif sum>0:
                    right-=1
                else:
                    left+=1
        return ans
                    
obj = Solution()
nums = [-1,0,1,2,-1,-4]
print(obj.threeSum(nums))