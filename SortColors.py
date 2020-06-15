// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

Useing 3 pointers, one for each color to push each colored ball towards the respective pointers's side.

class Solution(object):
    def sortColors(self, nums):
        
        low = 0
        mid=0
        high = len(nums)-1
        
        while(mid<=high):
            if(nums[mid]==1):
                mid=mid+1
            elif(mid == 0):
                self.swap(nums,low,mid)
                low = low+1
                mid = mid+1
            else:
                self.swap(nums,mid,high)
                high = high-1
        return nums  
    def swap(self,nums,i,j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
