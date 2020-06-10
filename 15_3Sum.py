"""
Time Complexity : O(n) [n = length of the input list]
 
Space Complexity : O(1)
 
Did this code successfully run on Leetcode : Yes
 
Any problem you faced while coding this : No

Approach
1. Sort the input list. Iterate over the list with index i
2. For each i, we try to j(starts at i+1) and k(starts at len(nums)-1) index such that the sum is equal to zero. Alternatively, nums[j]+nums[k]==-nums[i]
3. If the nums[j]+nums[k] is greater than the target(-nums[i]), we increment the index j, otherwise we decrement index k
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        i =0
        res = []
        while i < len(nums)-2:
            # if the curr value is same as previous
            # Since the triplet is already added for the value
            if i!=0 and nums[i] == nums[i-1]:
                i+=1
                continue
            j = i+1
            k = len(nums)-1
            target = -1 * nums[i]
            while j < k:
                if (nums[j] + nums[k]) == target:
                    res.append([nums[i], nums[j] , nums[k]])
                    # Once a j value has been used for the result, we can skip all the subsequent same values
                    while j < k and nums[j] == nums[j+1]:
                        j+=1
                    j+=1
                    # Once a k value has been used for the result, we can skip all the subsequent same values
                    while k > j and nums[k] == nums[k-1]:
                        k-=1
                    k-=1
                elif (nums[j] + nums[k]) < target:
                    # Since the current j value is not applicable, we can skip all the subsequent same values
                    while j < k and nums[j] == nums[j+1]:
                        j += 1
                    j+=1
                else:
                    # Since the current k value is not applicable, we can skip all the subsequent same values
                    while k > j and nums[k] == nums[k-1]:
                        k-=1
                    k-=1
            i+=1


"""
Important test case
[-2,0,0,2,2]
"""