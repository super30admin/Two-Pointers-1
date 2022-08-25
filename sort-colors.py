# Time Complexity :O(N) since we check for each element of the array 
# Space Complexity :O(1) no extra space used
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l=0
        r=len(nums)-1
        cur=0
        while cur<=r:
            #if number at cur pointer is 0, we swap it with the left most pointer and increment both cur and l pointers
            if nums[cur]==0:
                nums[l], nums[cur]=nums[cur], nums[l]
                l+=1
                cur+=1
            #if nums[cur] is 2, we swap it with number at rightmost pointer
            elif nums[cur]==2:
                nums[r], nums[cur]=nums[cur], nums[r]
                r-=1
                   
            else:
                cur+=1