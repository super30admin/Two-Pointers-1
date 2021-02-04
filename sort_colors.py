'''
Time complexity: O(n)
Space complexity: O(1)
'''
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # Approach 1: Using 2 boundaries for 0 and 1 => left and right and one pointer => current    
        left = 0
        current = 0
        right = len(nums) - 1
        
        while current <= right:
            if nums[current] == 0:
                self.swap(nums, current, left)
                current = current + 1 
                left = left + 1
            elif nums[current] == 1:
                current = current + 1
            elif nums[current] == 2:
                self.swap(nums, current, right)
                right = right - 1
        
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        
        '''
        Approach 2
        hm = {}
        colors = [0,1,2]
        for i in nums:
            hm[i] = hm.get(i, 0) + 1
        nums.clear()
        for color in colors:
            if color in hm:
                nums += [color] * hm.get(color)
        
        Approach 3
        count_0 = 0
        count_1 = 0
        count_2 = 0
        for i in nums:
            if i == 0:
                count_0 = count_0 + 1
            elif i == 1:
                count_1 = count_1 + 1
            elif i == 2:
                count_2 = count_2 + 1
        nums[:] = [0] * count_0 + [1] * count_1 + [2] * count_2
        '''
        