class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums)==3:
            if sum(nums)==0:
                return [nums]
            else:
                return []

        nums.sort()
        print(nums)
        res= set()
        for i in range(len(nums)):
            s=nums[i]
            if i>0 and nums[i]==nums[i-1]:
                continue
            low= i+1
            high= len(nums)-1
            while low<high:
                if  s+ nums[low]+nums[high]>0:
                    high-=1
                elif s+ nums[low]+nums[high]<0:
                    low+=1
                else:
                    # s+ nums[low]+nums[high]==0:
                    res.add(tuple((s,nums[low],nums[high])))
                    low+=1
                    high-=1
                    while low<high and nums[low]==nums[low-1]:
                        low+=1
                    while low<high and nums[high]==nums[high+1]:
                        high-=1

        print(res)
        return list(res)
        