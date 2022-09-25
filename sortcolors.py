#time complexity:o(n)
#space complexity:o(1) sorted in place
#passed all cases on LeetCode:yes
#difficulty faced:-
# comments:in the code
#https://leetcode.com/problems/sort-colors/
class Solution:
    def sortColors(self, nums: 'List[int]') -> None:
        """
        Do not return anything, modify nums in-place instead.
        
        """
        #this is like 2 ptr solution but have to maintain 3 ptrs for each color
        #btr is high ptr, wptr is mid and rptr is medium
        bptr = len(nums)-1 
        rptr = 0
        wptr = 0
        def swap(i,j,nums):
            nums[i],nums[j] = nums[j],nums[i]
        
        while wptr <= bptr:
            
            #if we see a blue ball at wptr then swap it with bptr
            if nums[wptr] == 2:
                swap(wptr,bptr,nums)
                bptr -= 1
             
            #if we see a red ball then swap and increment both pointers
            elif nums[wptr] == 0:
                swap(wptr,rptr,nums)
                wptr += 1
                rptr += 1
            
            #othw if we see a white ball just inc wptr
            else:
                wptr += 1