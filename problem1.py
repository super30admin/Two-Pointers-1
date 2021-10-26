#Time complexity O(n) and space complexity O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
       """
#Initializing left,right and index pointer
        s=0
        e=len(nums)-1
        i=0
#traversing through the elements
        while i <=e:
#If element is 0 then swaping it with left element and incrementing left and index pointer           
            if nums[i] == 0:
                nums[i],nums[s]=nums[s],nums[i]
                s+=1 
                i+=1
#If 
            elif nums[i]==1:
                i+=1
#if the element is 2 then swaping it with rightmost element and decrementing right pointer
            elif nums[i]==2:
                nums[i],nums[e]=nums[e],nums[i]     
                e-=1
