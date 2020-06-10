  ---------------------- 3sum------------------------------------------------   
# Time Complexity : O(N**2) N is the length of the nums.
# Space Complexity : O(1) as I am returning the same array used to store the array.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I used 2 pointer approach, first I sorted the elements, then by taking one 
# element at a time and using 2 pointer approach with other elements I am checking whether the sum equals to 0 or not. 
# To eliminate the duplicate values, we will have a while loop until we pass through the duplicate element.


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]:
                continue
            
            j = i+1
            k = len(nums)-1
            while j<k:
                s = nums[i]+nums[j]+nums[k]
                if s== 0:
                    res.append([nums[i],nums[j],nums[k]])
                    while j<k and nums[j]==nums[j+1]:
                        j +=1
                    while j<k and nums[k] == nums[k-1]:
                        k -=1
                    
                    j +=1
                    k -=1
                    
                elif s <0:
                    j +=1
                else:
                    k -=1
        return res