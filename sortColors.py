class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # 2 - pointer approach
        # TC : O(n)
        # SC : O(1)
        if nums is None or len(nums) == 0:
            return
        n = len(nums)
        left,mid,right = 0,0,n-1
        while mid <= right:
            if nums[mid] == 2:
                nums[mid],nums[right] = nums[right],nums[mid]
                right -= 1
            elif nums[mid] == 0:
                nums[mid],nums[left] = nums[left],nums[mid]
                left += 1
                mid += 1
            else:
                mid += 1
            
        