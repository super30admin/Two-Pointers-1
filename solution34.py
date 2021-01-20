#Time Complexity:O(n)
#Space Complexity:O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)==0:                                #if nums is empty return 
            return
        low=mid=0                                       #initializing low and mid pointers to zero
        high=len(nums)-1                                #initializing high pointer to last element of array
        while(mid<=high):                               #while mid pointer is before high pointer
            if nums[mid]==1:                            #if mid pointer is pointing at 1
                mid+=1                                  #increment mid pointer
            elif nums[mid]==0:                          #if mid pointer is pointing at 0
                self.swap(nums,low,mid)                 # swap mid pointer and low pointer elements
                low+=1                                  #increment low
                mid+=1                                  #increment mid
            else:                                       #if mid pointer is pointing at 2
                self.swap(nums,mid,high)                #swap mid pointer and high pointer elements
                high-=1                                 #decrement high 
    
    def swap(self,nums:List[int],i:int,j:int)->None:    #swaping elements
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp