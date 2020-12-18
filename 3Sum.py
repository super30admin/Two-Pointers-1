# TC : O(n^2)
# SC : O(1)
# Approach : Sort the array. If nums[i] > 0, break, as we won't find triplet summing to 0. If nums[i]+nums[l]+nums[r]
# > 0, we decrement right, else if < 0, we increase left, else we add the triplet to our result, and update
# both left right pointers. Meanwhile, we also update the left right ptrs, when we encounter same number, as it
# will lead to duplicate triplets. 

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        length = len(nums)
        for i in range(length-2):
            if nums[i]>0:
                break
            if i>0 and nums[i]==nums[i-1]:
                continue
            l,r = i+1,length-1
            while l<r:
                total = nums[i]+nums[l]+nums[r]
                
                if total < 0 :
                    l+=1
                elif total > 0 :
                    r-=1
                else:
                    result.append([nums[i],nums[l],nums[r]])
                    while l<r and nums[l]==nums[l+1]:
                        l+=1
                    while l<r and nums[r]==nums[r-1]:
                        r-=1
                    l+=1
                    r-=1
        return result