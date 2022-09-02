class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p1= 0
        p2=0
        p3= len(nums)-1
        
        while p2 <= p3:
            if nums[p2]==0:
                nums[p1] , nums[p2] = nums[p2], nums[p1]
                p1+=1
                p2+=1
            elif nums[p2]==2:
                nums[p3] , nums[p2] = nums[p2], nums[p3]
                p3-=1
            else:
                p2 +=1
