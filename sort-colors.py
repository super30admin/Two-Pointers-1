class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 1:
            return nums
        counter = [0, 0, 0]
        
        for i in nums:
            if i == 0:
                counter[0] +=1
            if i == 1:
                counter[1] +=1
            if i == 2:
                counter[2] +=1
            
        #print(counter[0],counter[1],counter[2])
        for i in range(counter[0]):
            nums[i]=0
       # print(nums,counter[0],counter[1])
        
        for i in range(counter[0],counter[0]+counter[1]):
            nums[i]=1
       # print(nums)
                
        for i in range(counter[0]+counter[1],counter[0]+counter[1]+counter[2]):
            nums[i]=2
       # print(nums)
        
        return nums