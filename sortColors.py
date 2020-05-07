#Time Complexity:O(n)
#Space Complexity:O(1)
#Ran successfully on Leetcode:Yes
#Count the number of 0s,1s,2s. 
#write the respective number of 0,1,2s in the order.
#This needs two traversal on the given array.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count0=0
        count1=0
        count2=0
        
        for i in nums:
            if i==0:
                count0+=1 
            elif i==1:
                count1+=1
            else:
                count2+=1
        i=0
        while (count0 > 0): 
            nums[i] = 0
            i+=1
            count0-=1
        
        # Then all the 1s 
        while (count1 > 0): 
            nums[i] = 1
            i+=1
            count1-=1

        # Finally all the 2s 
        while (count2 > 0): 
            nums[i] = 2
            i+=1
            count2-=1
        return nums
            
