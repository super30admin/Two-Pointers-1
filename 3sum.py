class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        nums=sorted(nums)
        n=len(nums)
        result=[]

        for i in range(len(nums)):
            if nums[i]>0:
                break
            if i>0 and nums[i]==nums[i-1]:
                continue
            l=i+1
            r=n-1
            while l<r:
                sum=nums[i]+nums[l]+nums[r]

                if sum<0:
                    l=l+1
                elif sum>0:
                    r=r-1
                else:
                    result.append([nums[i],nums[l],nums[r]])
                    l=l+1
                    r=r-1
                    while l<r and nums[l]==nums[l-1]:
                        l=l+1
                    while l<r and nums[r]==nums[r+1]:
                        r=r-1
        return result
