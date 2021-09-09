# Time Complexity
0(n2)
# Space complexity
0(1)
# yes it worked succesfully on leetcode


class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = []
        if nums is None or len(nums)<3 :
            return []
        nums.sort()
        for i in range(len(nums)-2):
            if i>0 and nums[i] == nums[i-1]:
                continue;
            if nums[i]>0:
                break;
            low = i+1
            high = len(nums)-1
            while low< high:
                sum = nums[i]+nums[low]+nums[high]
                if sum == 0:
                    a = [nums[i],nums[low],nums[high]]
                    result.append(a)
                    low+=1
                    high-=1
                    while low < high and nums[low] ==nums[low-1]:
                        low+=1
                    while low < high and nums[high]==nums[high+1]:
                        high-=1
                elif sum >0:
                    high-=1
                else:
                    low+=1
        return result
