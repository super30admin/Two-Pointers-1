# Time Complexity : O(n) 
# Space Complexity : O(1) (If we don't consider returned list)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# - Take two pointer one for 0 at start and one for 2 at the end. Take 3rd index for current element that runs till k.
# - If current element is 0 than swap with 0's index and increase 0's index. If current element is 2 than swap with 2's index and decrease 2's index and also reduce current index because we need to check swaped element for 0.
# - Increase current index.

# Your code here along with comments explaining your approach
    
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
#       Start i and j at start of array and j at end. 
        i, j = 0, 0 
        k = len(nums) - 1
        
#       Run till i less than k
        while i <= k :
#       If current element is 0 than swap with i(i is end of 0 elements)
            if nums[i] == 0:
                nums[i], nums[j] = nums[j], nums[i]
#       Increase end of 0
                j += 1
#       If current element is 2 than swap with k(k is start of 2 elements)
            elif nums[i] == 2:
                nums[i], nums[k] = nums[k], nums[i]
#               decrease current element because it will increase again next. Overall we will be at swaped element and we want to check that it is 0 or not. If it is 0 than it will be swapped in next iteration.
                i -= 1
#               decrease start of 1
                k -= 1
#           Increase the current element
            i += 1
        
        