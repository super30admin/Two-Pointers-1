# https://leetcode.com/problems/sort-colors/submissions/1985832481/

def sortColors( nums):
    n = len(nums)
    l,m,r = 0,0,n-1
    while m <= r:
        curr = nums[m]
        if curr == 1:
            m += 1
        elif curr == 0:
            nums[l],nums[m]=nums[m],nums[l]
            l+=1
            m+=1
        else:
            nums[r],nums[m]=nums[m],nums[r]
            r-=1
nums=[2,0,1]
sortColors(nums)        
print(nums)