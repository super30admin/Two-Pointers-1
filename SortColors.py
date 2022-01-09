
#TimeComplexity:O(n)
#SpaceComplexity:O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :No
#Used Two Pointers approach to solve the problem
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums)-1
        
        while(mid <= high):
            
            if nums[mid] == 0:
                nums = self.swap(low,mid,nums)
                low +=1
                mid +=1
            elif nums[mid] == 1:
                mid+=1
            elif nums[mid] == 2:
                nums = self.swap(high,mid,nums)
                high -=1

            
    def swap(self,i,j,arr):
        print(i,j)
        print("sd")
        temp = arr[j]
        arr[j] = arr[i]
        arr[i] = temp
        return arr
 
        
        
        
        