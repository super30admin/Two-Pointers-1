def two_sum(nums, target) -> []:
    i = 0
    j = len(nums)-1
    results = []
    ans = []
    
    while (i < j):
        ans = []
        left = nums[i]
        right = nums[j]

        if (left + right) == target:
            ans.append(left)
            ans.append(right)
            results.append(ans)
            i+=1
            j-=1
            while (i < j and nums[i] == nums[i-1]):
                i+=1
            while (i < j and nums[j] == nums[j+1]):
                j-=1
        elif (left + right) < target:
            i+=1
        else:
            j-=1
    return results

def three_sum(nums, target):
    ans = []

    nums.sort()

    for idx, num in enumerate(nums):
        if idx > 0:
            if num == nums[idx-1]:
                continue
        t = target - num
        results = two_sum(nums[idx+1:], t)
        if len(results) > 0:
            results.append(num)
            ans.append(results)
    
    print(ans)


if __name__ == "__main__":
    nums = [-1,0,1,2,-1,-4]
    print(three_sum(nums, 0))