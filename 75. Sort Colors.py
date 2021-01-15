# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
	# Use 3 ponter approach
	# let l = 0,m=0 and h = len(nums)
	# compare m with h if m =1 let it be there itself m++
					# if m = 2 swap h with m h--
					# if m = 1 swap l with m m++ l++
	# Note:works only for this case.
	

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return []
        
        l = 0
        m = 0
        h = len(nums) - 1
        def swap(a,b):
            nums[a],nums[b] = nums[b],nums[a]
            
        while m<=h:
            if nums[m] == 1:
                m +=1
            elif nums[m] == 2:
                swap(m,h)
                h -= 1
                
            elif nums[m] == 0:
                swap(m,l)
                m += 1
                l += 1
            
        return nums
                