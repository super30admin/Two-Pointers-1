#Time Compelxity is: O(n) where n is the size of the array
#Space Complexity is: O(1) 
#Program ran successfully on leet code
#No problem faced while writing the code

#Sorting colors
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        #Initializing the three pointers
        left=0
        mid=0
        right=len(nums)-1
        
        while(mid<=right):
            #If the value at mid is 2, we will swap with right handside values as we need to bring 2's to right
            if(nums[mid]==2):
                nums[mid],nums[right]=nums[right],nums[mid]
                right-=1
            #If the value at mid is 0, we will swap with left handside values as we need to bring 0's to left
            elif(nums[mid]==0):
                nums[mid],nums[left]=nums[left],nums[mid]
                left+=1
                mid+=1
            #If the above cases fail, we will just increment the mid value
            else:
                mid+=1
        #return the nums list
        return nums
        