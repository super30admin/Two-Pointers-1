# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    def sortColors(self,nums):
        result = []
        if not nums:
            return result 

        low, mid , high = 0, 0 , len(nums)-1 
        while mid <= high:
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid] 
                high -= 1 
            
            elif nums[mid] == 1:
                mid += 1 
                
            
            else:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1 
                mid += 1 
        return nums 

if __name__ == "__main__":
    s = Solution()
    # nums = [2,0,2,1,1,0]
    nums = [2, 0, 2, 1, 1, 0, 2, 2, 1, 1, 0]
    res = s.sortColors(nums)
    print(res)
        