## Problem2 (https://leetcode.com/problems/3sum/)
# Time complexity - O(n^2)
# Space complexity - O(1) if the return list is not included in memory

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return []
        
        nums.sort()
        # print(nums)
        triplets = set()
        for x in range(len(nums)):  
            i = x+1
            j = len(nums)-1
            while(i<j):
                rsum = nums[x] + nums[i] + nums[j]
                # print(rsum)
                if (rsum < 0):
                    i+=1
                elif(rsum > 0):
                    j-=1
                else:
                    # print((nums[x], nums[i], nums[j]))
                    combo = (nums[x], nums[i], nums[j])
                    triplets.add(tuple(combo))
                    i+=1
                    j-=1
                    while(i<j and nums[i] == nums[i-1]):
                        # print("ii",i)
                        i+=1
                    while(i<j and nums[j] == nums[j+1]):
                        # print("jj",j)
                        j-=1
        return triplets
                
        
                
        