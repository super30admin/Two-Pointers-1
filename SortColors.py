// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// // Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        i=0
        j=len(nums)-1
        curr=0
        while curr<=j: #swap every 0 to left most , swap every 2 to right most
            if nums[curr]==0:
                nums[i],nums[curr]=nums[curr],nums[i]
                curr+=1                     
                i+=1            #keep track of 0's next position that is to be swapped
            elif nums[curr]==1:
                curr+=1
            else:
                nums[curr],nums[j]=nums[j],nums[curr]
                j-=1 #keep track of 2's next position that is to be swapped