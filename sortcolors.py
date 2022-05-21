#Time complexity: O(n)
#space complexity: O(1)
#did your code run on leetcode: yes

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if nums == [] or len(nums) == 0 : return
        
        left = 0 
        mid = 0
        right = len(nums) - 1
        
        while(mid <= right):
            if nums[mid] == 0:
                self.swap(nums,mid,left)
                left+=1
                mid+=1
            
            elif nums[mid] == 2:
                self.swap(nums,mid,right)
                right-=1
            else:
                mid +=1
                
    def swap(self,nums: List[int],mid:int,j:int)-> None:
        temp = nums[mid]
        nums[mid] = nums[j]
        nums[j] = temp
        
