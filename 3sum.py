class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        # 2 Pointer approach
        #x = set([-1*i for i in nums])
        res = []
        nums.sort()
        
        for i in range(0,len(nums)):
            if nums[i] > 0:
                break
            if i == 0 or nums[i - 1] != nums[i]:
                res += self.twoSum(nums[i+1:],nums[i])
        
        return res
    
    def twoSum(self,nums,c):
        low = 0 
        high = len(nums)-1
        res=[]
        while(low<high):
            sum1 = c + nums[low] + nums[high]
            if sum1 < 0:
                low += 1
            elif sum1 > 0:
                high -= 1
            else:
                
                res.append([c,nums[low],nums[high]])
                low +=1
                high -= 1
                while low<high and nums[low] == nums[low - 1]:
                    low += 1
            
        return res
