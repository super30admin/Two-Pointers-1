class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = set()
        nums =sorted(nums)
        for i in range(len(nums)):
            target= 0 -nums[i]
            l=i+1
            r=len(nums)-1
            while l<r:
                if nums[l]+nums[r]==target:
                    result.add((nums[i],nums[l],nums[r]))
                    l+=1
                    r-=1
                elif nums[l]+nums[r]<target:
                    l+=1
                else:
                    r-=1
        return list(result)
                    