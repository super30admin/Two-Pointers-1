// Time Complexity : O(nlogn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// // Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans=set()
        
        for i in range(len(nums)-2): # using general binary search, if i=0 , j = i+1 and k = len(arr)-1, traverse every element
            left=i+1
            right=len(nums)-1
            while left<right:
                sum=nums[i]+nums[left]+nums[right]
                if sum==0 :
                    ans.add((nums[i],nums[left],nums[right])) # add in hashset, to prevent duplicating elements
                    left+=1
                    right-=1
                elif sum<0:
                    left+=1
                else:
                    right-=1
        return list(ans)         # return final answer