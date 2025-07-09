# Time Complexity: O(n^2)
# Space Complexity: O(1)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: The logic of skipping duplicates was tricky to get correct in the first pass 
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        if not nums:
            return []
        

        n = len(nums)
        nums.sort()

        res = []
        for i in range(n):
            # skip duplicates for the outer loop
            # this is to ensure that we do not have duplicate triplets in the result
            if i!=0 and nums[i]==nums[i-1]:
                continue
            # set the left and right pointers
            # left pointer starts from the next index of i
            # right pointer starts from the last index of the array
            l = i+1
            r = n-1

            # the target is the negative of the current number since we fix nums[i] and want to find two other numbers that sum to zero with it
            # nums[i] + x + y = 0
            # x + y = -nums[i]
            # we find tgt sum using two pointer approach
            tgt = -1 * nums[i]

            while l<r:

                current_sum = nums[l] + nums[r]
                # if the current sum is less than the target, we need to increase the sum by moving the left pointer
                if current_sum < tgt:
                    l+=1
                # if the current sum is greater than the target, we need to decrease the sum by moving the right pointer
                elif current_sum > tgt:
                    r-=1
                # if the current sum is equal to the target, we have found a triplet
                else:
                    res.append( [nums[i],nums[l], nums[r]] )
                    l+=1
                    r-=1

                    # skip duplicates for the left pointer
                    while l<r and nums[l]==nums[l-1]:
                        l+=1
                    # skip duplicates for the right pointer
                    while l<r and nums[r]==nums[r+1]:
                        r-=1
                    
        return res
