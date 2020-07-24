def pointerMethod(nums):
    '''
    time complexity = O(n^2)
    space complexity = O(1)
    approach :
    1. sort the array
    2. assign a pointer(i) starting from 0:n-2
    3. other two pointers low and high will traverse
    4. if sum==0 move low++ and high-- to unique values
    5. if sum<0 move low++ elif sum>0 move high--
    '''
    if len(nums)<3:
        return []
    # sort the array nlog(n)
    nums.sort()
    # store result
    result=[]
    for i in range(len(nums)-2):
        if i>0 and nums[i] == nums[i-1]:
            continue
        low=i+1
        high = len(nums)-1
        while low<high:
            sums=nums[i]+nums[low]+nums[high]
            if sums == 0:
                result.append([nums[i],nums[low],nums[high]])
                low+=1
                high-=1
                while low<high and nums[low]==nums[low-1]: low+=1
                while low<high and nums[high] == nums[high+1]: high-=1

            elif sums<0:
                low +=1
            else:
                high -=1

    return result

nums = [-1, 0, 1, 2, -1, -4]

print(pointerMethod(nums))