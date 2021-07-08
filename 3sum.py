class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        out = []
        
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
                
            p = i
            l = i+1
            h = len(nums) - 1
            t = -nums[i]
            
            while l<h:
                if nums[l] + nums[h] < t:
                    l += 1
                elif nums[l] + nums[h] > t:
                    h -= 1
                else:
                    out.append([-t, nums[l], nums[h]])
                    l += 1
                    h -=1
        
        return out


# sorting the array first, and then iterating through it. first iterated value is pivot.
# initializing low and high and finding the negative of pivot as a target by taking two pointers
# in the rest of the array as twoSum problem
# TC: O(n^2) SC: O(1)