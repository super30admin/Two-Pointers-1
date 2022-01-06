# Time Complexity - O(n)
# Space Complexity - O(1)
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # Optimized - Single Pass
        
        
        # Bruteforce
        if not nums: return []
        counter = [0 for i in range(3)]
        for i in range(len(nums)):
            counter[nums[i]] += 1
        i = 0
        for j in range(counter[0]):
            nums[i] = 0
            i+= 1
        for j in range(counter[1]):
            nums[i] = 1
            i+= 1
        for j in range(counter[2]):
            nums[i] = 2
            i+= 1
