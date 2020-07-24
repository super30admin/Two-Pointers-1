def bruteforce(nums):
    '''
    time complexity = O(n^2)
    space complexity = O(1)
    approach: two pointers
    values after current pointer are sorted and pointer 'i' traverse through the list
    if nums[current]>nums[i] swap the values.
    '''
    for current in range(len(nums)):
        for i in range(current,len(nums)):
            if nums[current]>nums[i]:
                nums[i],nums[current]=nums[current],nums[i]
    return nums

def hasmapmethod(nums):
    '''
    Approach: count the occurance and stroe in hashmap, return new generated list
    time complexity = O(n)
    space complexity = O(1) since only values are 0,1,2
    '''
    hashmap={}
    for i in nums:
        if i not in hashmap:
            hashmap[i]=1
        else:
            hashmap[i]+=1

    return [0]*hashmap[0] + [1]*hashmap[1] + [2]*hashmap[2]

def twopointer(nums):
    '''
    Appraoch:
    1. keep 3 pointers.
    2. values after low pointer are 0, values after high pointer are 2
    time Complexity = O(n)
    space complexit = O(1)
    Working on Leetcode = yes
    '''
    left=0
    right=len(nums)-1
    i=left
    while i<=right:
        if nums[i]==0:
            nums[i],nums[left]=nums[left],nums[i]
            left+=1
            i+=1
        elif nums[i]==2:
            nums[i],nums[right] = nums[right],nums[i]
            right -=1
        else:
            i+=1

    return


nums=[2,0,1,2,1,0,1,1,2,1,2,0,0]
bruteforce(nums)
# res=hasmapmethod(nums)
# print(res)
# twopointer(nums)
print(nums)
