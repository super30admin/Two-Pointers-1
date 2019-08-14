"""
time: O(n^2)
space: O(1)
Leet : Accepted
Problems: None. Thought complexity could be better but checked solutions to find n^2 was the best possible
"""


class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        #sort list so we can use two pointers at two ends
        nums.sort()
        res=[]
        #nums[i] is the number which is one of the three elements
        for i in range(len(nums)-2):
            #don't check if already checked
            if i>0 and nums[i] == nums[i-1]:
                continue

            #simple two pointer two sum approach for remaining two elements
            first = i+1
            last = len(nums)-1
            while first<last:
                temp = nums[i] + nums[first] + nums [last]
                if temp<0:
                    first += 1
                elif temp>0:
                    last -= 1
                else:
                    res.append((nums[i], nums[first], nums[last]))
                    #loops to prevent coming up with same answer again
                    #we could also have made res a set here instead of loops
                    while first<last and nums[first]==nums[first+1]:
                        first += 1
                    while first<last and nums[last]==nums[last-1]:
                        last -= 1
                    first += 1
                    last -= 1
        return res
