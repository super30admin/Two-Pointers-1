# Time Complexity : It is O(n) since we are iterating with the list.
# Space Complexity : It is O(1) so extra space.
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


from typing import List

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        
        LP=0
        RP= len(nums)-1
        Curr=1
        while(Curr<=RP):
            
            if nums[Curr]==0:
                temp = nums[LP]
                nums[LP]=nums[Curr]
                nums[Curr] =temp
                LP+=1
                Curr+=1            
            elif nums[Curr]==1:
                Curr+=1                               
            elif nums[Curr]==2:
                temp = nums[RP]
                nums[RP]=nums[Curr]
                nums[Curr] =temp
                RP+=-1
            
            
        print(nums)
        return nums
        
        
obj = Solution()
obj.sortColors([2,0,1])
obj.sortColors([2,0,2,1,1,0])