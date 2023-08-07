#Time Complexity : O(n^2)
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to have an outer loop iteration for the pivot element and use two pointers approach on the inner iterations.Internal duplicacy is managed when the previous element equals current element.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        result = []
        nums.sort()

        for i,num in enumerate(nums):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue
            else:
                l = i + 1
                r = len(nums)-1

                while(l < r):
                    threeSum = num + nums[l] + nums[r]

                    if threeSum < 0:
                        l += 1
                    elif threeSum > 0:
                        r -= 1
                    else:
                        result.append([num, nums[l], nums[r]])
                        l += 1
                        while nums[l]==nums[l-1] and l < r:
                            l += 1
                        while nums[r]==nums[r-1] and l < r:
                            r-=1
            
        return result