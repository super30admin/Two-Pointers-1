#  #Time Comp = O(n) - as we are doing a single pass thru the list
#space complexity = o(1) - as we  are using constant space


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
       
    
      
        index = n0 =0 

        n2 = len(nums) -1

        while index <= n2:
            if nums[index] ==0:
                nums[n0] , nums[index]= nums[index], nums[n0] 
                n0+=1
                index +=1
            elif nums[index] ==2:
                nums[index], nums[n2]= nums[n2], nums[index]
                n2-=1
            else:
                index +=1 