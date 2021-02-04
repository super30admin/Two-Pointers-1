// Time Complexity : O(nlog n) +O(n^2) = O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        lst=[]
        nums.sort()                             //to make a list ordered which is O(nlog n)
        for i in range(len(nums)-2):                    // O(n^2)       //i will be the first element
            if i!=0 and nums[i-1]==nums[i]:
                continue
            left=i+1
            right=len(nums)-1
            
            while left<right:                                   traverse from i+1 till last element of list
                temp_sum=nums[left]+nums[right]+nums[i]
                if temp_sum==0:                                         if i , left, right indexes give sum=0 =>store elements in output list
                    lst.append([nums[i],nums[left],nums[right]])
                    left+=1
                    right-=1
                    while left<right and nums[left-1]==nums[left]:
                        left+=1
                    while left<right and nums[right+1]==nums[right]:
                        right-=1
                elif temp_sum<0:                                        //sum is <0 => move towards right to make sum close to zero
                    left+=1
                    while left<right and nums[left-1]==nums[left]:
                        left+=1
                else:                                                      //sum is >0 => move towards left to make sum close to zero
                    right-=1
                    while left<right and nums[right+1]==nums[right]:
                        right-=1
        return lst
        
