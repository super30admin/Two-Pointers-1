def sort_colors(nums):
    p0 = 0
    p2 = len(nums)-1
    curr = p0

    while (curr <= p2):
        if nums[p0] == 0:
            nums[p0], nums[curr] = nums[curr], nums[p0]
            p0+=1
            curr+=1
        elif nums[curr] == 2:
            nums[curr], nums[p2] = nums[p2], nums[curr]
            p2-=1
        else:
            curr+=1
    return nums
    
if __name__ == "__main__":
    nums = [2,0,2,1,1,0]
    print(sort_colors(nums))