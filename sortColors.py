class Solution:
    def sortColors(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def swap(i ,j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
 
        mid = l = 0
        r = len(nums)-1
        while mid <= r:
            if nums[mid] == 2:
                swap(mid,r)
                r -= 1
            elif nums[mid] == 0:
                swap(mid,l)
                l += 1
                mid += 1
            else:
                mid += 1

#TC: O(n)
#SC: O(1)