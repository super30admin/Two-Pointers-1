def sortColors(self, nums: List[int]) -> None:
    if not nums:
        return
        
    left = mid = 0
    right = len(nums) - 1
    
    while mid <= right:
        if nums[mid] == 0:
            nums[left], nums[mid] = nums[mid], nums[left]
            left += 1
            mid += 1
        elif nums[mid] == 2:
            nums[right], nums[mid] = nums[mid], nums[right]
            right -= 1
            # might need to be processed
        else:  # nums[mid] == 1
            mid += 1
