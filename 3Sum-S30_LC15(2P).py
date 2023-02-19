# 2 pointers
# Submitted Successfully
# TC=O(n*n), SC=O(1)
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums=sorted(nums)    # required for this 2 pointer approach. TC=O(n*logn)
        out=[]

        for i in range(len(nums)):
            if (i>0 and nums[i]==nums[i-1]): continue    # new element has same value as previous one. continue skips the current iteration of the loop and goes to the next iteration
            if (nums[i]>0): break    # if one element is positive, all after it will be positive because sorted array. break is used to terminate the loop.
            L = i+1
            R = len(nums)-1
            while L<R:
                if nums[L]+nums[R]+nums[i] < 0:
                    L+=1
                elif nums[L]+nums[R]+nums[i] > 0:
                    R-=1
                else:
                    out.append([nums[L],nums[R],nums[i]])
                    L+=1
                    R-=1
                    while(L<R and nums[L]==nums[L-1]):    # new element has same value as previous one. Keep moving until a new value is found. L<R is required as we are updating the pointers inside 'else'
                        L+=1
                    while(L<R and nums[R]==nums[R+1]):
                        R-=1
        return out