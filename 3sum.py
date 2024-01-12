"""Explanation: Extension of 2 sum. So we iterate and loop from left to right of the arrat, so our target becomes 0-current value. Then just
   using the two sum solution to find the target from our remaining list.  when we solve the 3 sum problem we can sort the whole list first, 
   in this way, we can also guarantee the answers we get are in the same order.
   Time Complexcity: O(n^2) + O(log n) since sort takes log n
   Space Complexcity: O(n)
"""


class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # sorting the given arr : O(log n)
        nums.sort()
        result = []
        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i-1]:
                # to avoid dup triplets
                continue
            j, k = i+1, len(nums)-1
            while j < k:
                s = nums[j] + nums[k]
                if s < -nums[i]:
                    j+=1
                elif s > -nums[i]:
                    k-=1
                else:
                    result.append([nums[i], nums[j], nums[k]])
                    j+=1
                    k-=1
                    # below 2 loops to avoid dup triplets
                    while j < k and nums[j] == nums[j-1]:
                        j+=1
                    while j < k and nums[k] == nums[k+1]:
                        k-=1
        return result
        