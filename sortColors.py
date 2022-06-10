#time complexity : O(n)
#space complexity : O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #null case
        if(nums == None or len(nums) == 0) :
            return
        #defining three pointers low pointer for red color, mid pointer for white color and blue pointer for the blue color
        #low pointer and mid pointer pointer pointing to first index
        low = 0 
        mid = 0
        #high pointer starting from end move to left 
        high = len(nums) -1
        
        #defining the while loop for arranging the colors one after the other 
        while mid<=high:
            #if mid is pointing to 0 then swaping with mid to low and increasing the lower pointer
            if nums[mid]==0:
                nums[mid],nums[low] = nums[low], nums[mid]
                low +=1
                mid +=1
                
            #if mid is pointing to 2 than element at high is swap with mid
            elif nums[mid]==2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -=1
            else:
                mid +=1
                
                
                

    
