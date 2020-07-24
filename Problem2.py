#Two Pointers-1
#Problem2 : Leetcode https://leetcode.com/problems/3sum/
#All test cases passed on Leetcode
#Time Complexity-O(NlogN)
#Space Complexity-O(1)

class Solution:
    def threeSum(self, nums):
        result=[]
        if len(nums)<3:
            return result
        nums.sort()
        n=len(nums)
        for i in range(n-2):
            if i>0 and nums[i-1]==nums[i]:
                continue
            low=i+1
            high=n-1
            while low<high:
                sum=nums[i]+nums[low]+nums[high]
                #case1 sum=0
                if sum==0:
                    current=[nums[i],nums[low],nums[high]]
                    result.append(current)
                    low+=1
                    high-=1
                    while low<high and nums[low]==nums[low-1]:
                        low+=1
                    while low<high and nums[high]==nums[high+1]:
                        high-=1
                elif sum<0:
                    low+=1
                else:
                    high-=1
        return result
                    
  
sol = Solution()
nums = [-1, 0, 1, 2, -1, -4]
res=sol.threeSum(nums)
print(res)



        
        















