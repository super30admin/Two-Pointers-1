 # Time Complexity : O(N2)
# Space Complexity : O{1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


 def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        res = []

        nums.sort()

        for i in range(len(nums)):

            if i>0 and nums[i]==nums[i-1]:
                continue

            l = i+1
            r = len(nums)-1

            while(l<r):
                if nums[i]+nums[l]+nums[r]==0:
                    res.append([nums[i],nums[l],nums[r]])
                    l+=1
                    while nums[l]==nums[l-1] and l<r:
                        l+=1

                elif nums[i]+nums[l]+nums[r]>0:
                    r-=1

                else:
                    l+=1
        return res     