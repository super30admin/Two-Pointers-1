class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 1:
            return nums

        l = nums[0]
        mid = nums[0]
        h = len(nums)-1

        while(mid<=h):
            if nums[mid] == 2:
                nums[mid],nums[h] = nums[h],nums[mid]
                h -= 1
            else:
                if nums[mid] == 0:
                    nums[mid],nums[l] = nums[l],nums[mid]
                    l += 1
                    mid += 1
                    
                else:
                    mid += 1
            
        return nums


