// Time Complexity :o(n^n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :no
// Any problem you faced while coding this :(-1,-1, 2) is not vaild value for the expected return type list(int)



class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort();
        for i in range(0,len(nums)):
            a=nums[i]
            sum=-a
            start=i+1
            end=len(nums)-1
            while(start<end):
                sum1=nums[start]+nums[end]
                if(sum1==sum):
                    return a,nums[start],nums[end]
                else:
                    if(sum1<sum):
                        start+=1
                    else:
                        end-=1
