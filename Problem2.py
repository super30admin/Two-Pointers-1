class Solution:
    def threeSum(self,nums):
        nums.sort()
        res=[]
        n=len(nums)

        for i in range(n):
            if i >0 and nums[i]==nums[i-1]:
                continue

            left,right=i+1,n-1

            while left<right:
                total=nums[i]+nums[left]+nums[right]

                if total<0:
                    left+=1
                elif total>0:
                    right-=1
                else:
                    res.append([nums[i],nums[left],nums[right]])
                    while left<right and nums[left]==nums[left+1]:
                        left+=1
                    while left<right and nums[right]==nums[right-1]:
                        right-=1
                    left +=1
                    right-=1
        return res

sol=Solution()
print(sol.threeSum(nums = [-1,0,1,2,-1,-4]))
print(sol.threeSum(nums = [0,1,1]))
print(sol.threeSum(nums = [0,0,0]))