class Solution:
    def swap(self,nums,l,r):
        temp = nums[l]
        nums[l] = nums[r]
        nums[r] = temp
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p0,p1,p2= 0,0,len(nums)-1
        
        while p1<=p2:
            
            if nums[p1] ==2:
                self.swap(nums, p1, p2)
                p2 -=1
                
            elif nums[p1] == 0:
                self.swap(nums,p0,p1)
                p0+=1
                p1+=1
            else:
                p1+=1
        return nums

#Time complexity o(n) one pass

#Space complexity o(1) in palce, iterate variables