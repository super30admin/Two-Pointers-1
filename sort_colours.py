#time complexity: O(n)
#time complexity: O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums==None or len(nums)==0: return []
        
        low=0
        high=len(nums)-1
        scan=0
        
        def swap(nums,x,y):
            temp=nums[x]
            nums[x]=nums[y]
            nums[y]=temp
        
        while(scan<=high):
            if nums[scan]==0:
                swap(nums, low, scan)
                low+=1
                scan+=1
                
            elif nums[scan]==2:
                swap(nums, high, scan)
                high-=1
                
            else:
                scan+=1