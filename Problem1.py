# // Time Complexity :  O(N)
# // Space Complexity :o(1)
# // Did this code successfully run on Leetcode :YES
# // Any problem you faced while coding this :NO
https://leetcode.com/problems/sort-colors/

# // Your code here along with comments explaining your approach
class Solution:
  """
  Use 3 pointer approach one for o's ,1's and 2's then make swaps
  """
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n=len(nums)-1
        l,m,h=0,0,n
        while(m<=h):
            if nums[m]==0:
                nums[m],nums[l]=nums[l],nums[m]
                m+=1
                l+=1
            elif nums[m]==2:
                nums[m],nums[h]=nums[h],nums[m]
                
                h-=1
            else:
                m+=1
                

                
