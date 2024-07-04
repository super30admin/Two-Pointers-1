# time = O(n^3)
# space = O(n)
def three_sum(nums):
    N = len(nums)
    nums.sort()
    print(nums)
    res = []

    for i in range(N-2):
        if i > 0 and nums[i] == nums[i-1]:
            continue

        left , right = i+1 , N-1

        while left<right:
            total = nums[i] + nums[right] + nums[left]

            if total<0:
                left+=1
            elif total>0:
                right-=1
            else:
                res.append([nums[i],nums[right],nums[left]])

            # while left<right and nums[left] == nums[left+1]:
            #     left+=1
            # while left<right and nums[right]== nums[right-1]:
            #     right-=1

            left+=1
            right-=1

    return res

nums = [-1, 0, 1, 2, -1, -4]
print(three_sum(nums))