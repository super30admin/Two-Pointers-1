#Time Complexity: O(n)
#Space Complexity: O(1)
#running on leetcode: yes
 
class Solution():
    def swap(arr,a,b):
        arr[a],arr[b]=arr[b],arr[a]
        return arr
    
    
    def sortColors(self, nums):
        
        #sanity check
        if (nums==None or len(nums)==0):
            return 0
        
        #assign pointers
        low = 0
        mid = 0
        high = len(nums)-1
        
        #update the pointers
        while (mid <= high):
            if nums[mid]==2:
                nums = Solution.swap(nums,mid,high)
                high -= 1
            elif nums[mid]==0:
                nums = Solution.swap(nums,mid,low)
                mid += 1
                low += 1
            else:
                mid += 1
              
        return nums
