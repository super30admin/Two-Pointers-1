# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 

def sortColors(nums):
       
        if len(nums) == 0 or nums == None:
            return 
        
        left = 0
        right = len(nums) - 1
        
        curr = 0
        while curr <= right:
            if nums[curr] == 0:
                nums[curr], nums[left] = nums[left], nums[curr]
                left += 1
                curr += 1
            elif nums[curr] == 1:
                curr += 1
            else:
                nums[curr], nums[right] = nums[right], nums[curr]
                right -= 1
        return nums


print sortColors([2,0,2,1,1,0])