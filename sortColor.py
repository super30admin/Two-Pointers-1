'''
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
'''

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if len(nums) == 0: return []
        left = 0
        mid = 0
        right = len(nums) - 1
        
        while(mid<=right):
            if nums[mid] == 1:
                mid +=1
            elif nums[mid] == 2:
                nums[mid],nums[right] = nums[right], nums[mid]
                right -=1
            elif nums[mid] == 0:
                nums[mid],nums[left] = nums[left], nums[mid]
                mid +=1
                left +=1
        return nums
                
                
        """
        Do not return anything, modify nums in-place instead.
        
        working solution
        
        zero = 0
        one = 0
        for val in nums:
            if val == 0:
                zero += 1
            elif val == 1:
                one += 1
            
        for i in range(len(nums)):
            if zero:
                nums[i] = 0
                zero -=1
            elif one:
                nums[i] = 1
                one -=1
            else:
                nums[i] = 2    
        return
        """

        
        
        '''
p0 = cur = 0
        p2 = len(nums) - 1 
        while cur <= p2:
            if nums[cur] == 0:
                nums[p0], nums[cur] = nums[cur], nums[p0]
                cur +=1
                p0 +=1
            elif nums[cur] == 2:
                nums[p2], nums[cur] = nums[cur], nums[p2]
                p2 -= 1
            else:
                cur += 1

'''       
        
                
                
    