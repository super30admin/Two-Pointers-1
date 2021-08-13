def sortColors(nums: list[int]) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """
    low = 0
    mid = 0
    high = len(nums)-1
    while mid <= high:
        if nums[mid] == 2:
            nums[mid],nums[high] = nums[high],nums[mid]
            high-=1
        elif nums[mid] == 1:
            mid+=1
        else:
            nums[mid],nums[low] = nums[low],nums[mid]
            mid+=1
            low+=1