#Two Pointers-1
#Problem1 : Leetcode https://leetcode.com/problems/sort-colors/
#All test cases passed on Leetcode
#Time Complexity-O(N)
#Space Complexity-O(1)

class Solution:
    def swap(self,nums,i,j):
        nums[i],nums[j]=nums[j],nums[i]
        
    def sortColors(self, nums) :
        """
        Do not return anything, modify nums in-place instead.
        """
        low=0
        mid=0
        high=len(nums)-1
        while mid<=high:
            if nums[mid]==1:
                mid+=1
            elif nums[mid]==0:
                self.swap(nums,low,mid)
                low=low+1
                mid=mid+1
            else:
                self.swap(nums,mid,high)
                high-=1
        
  
sol = Solution()
nums=[2,0,2,1,1,0]
sol.sortColors(nums)
print(nums)



        
        















