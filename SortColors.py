'''
Time complexity: O(N)
Space complexity: O(1)
'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        '''
        red - 0 
        white - 1 
        blue - 2 
        sort() not allowed, in place, order shoulbe 0s,1s, 2s 
        0 1 2 2 1 0
        This is a DNF algorithm problem
        here low and high acts as 2 boundaries such that low will push 1s to middle and high will push 2s to end
        '''
        if nums is None:
            return []
        low, mid, high = 0,0,len(nums) - 1
        while mid <= high:
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1 
            else:
                nums[mid],nums[high] = nums[high],nums[mid]
                high -= 1 
        return nums

