class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        nums.sort()

        result = []

        for i in range(len(nums)):

            if i>0 and nums[i-1]==nums[i]:
                continue
            
            left=i+1
            right = len(nums)-1

            while left<right:

                sum = nums[i]+nums[left]+nums[right]

                if sum>0:
                    right+=-1
                elif sum<0:
                    left+=1
                else:
                    result.append([nums[i],nums[left],nums[right]])
                    left+=1

                    while nums[left-1]==nums[left] and left<right:
                        left+=1
        

        return result
