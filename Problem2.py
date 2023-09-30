'''
1. We sort the array first and keep a pointer i at the first element. We then use 2 pointers l and r to find the 2 elements that sum up to -nums[i]
2. We check if the sum is 0, if yes, we add the triplet to the result and increment l and decrement r. We also check if the next element is the same as the current element, if yes, we skip it
3. If the sum is less than 0, we increment l and if the sum is greater than 0, we decrement r. If the outer element is positive, we break the loop as we have no way to get a -nums[i] sum since the array is sorted

TC: O(nlogn + n^2) = O(n^2)
SC: O(1)
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res=[]
        nums.sort()
        n = len(nums)
        for i in range(n):
            if nums[i] > 0:
                break
            if i>0 and nums[i] == nums[i-1]:
                continue
            l = i+1
            r = n-1
            while (l<r):
                triplet = nums[i] + nums[l] + nums[r]
                if triplet == 0:
                    res.append([nums[i],nums[l],nums[r]])
                    l += 1
                    r -= 1
                    while l<r and nums[l]==nums[l-1]:
                        l += 1
                    while l<r and nums[r]==nums[r+1]:
                        r -= 1
                elif triplet < 0:
                    l += 1
                else:
                    r -= 1 
        return res 