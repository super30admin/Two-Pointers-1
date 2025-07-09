# Time Complexity: O(n)
# Space Complexity: O(1)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # using two pointer approach
        
        # left --> 0 vals, mid --> 1 vals, right --> 2 vals
        left = 0
        mid = 0
        right = len(nums)-1

        while mid<=right:

            if nums[mid] == 2:
                # swap mid and right and decrement right pointer to indicate that we have stored a 2 in the right side
                nums[right], nums[mid] = nums[mid], nums[right]
                right-=1

            elif nums[mid] == 0:
                # swap mid and left , increment left&mid pointer to indicate that we have stored a 0 in the left side
                nums[left], nums[mid] = nums[mid], nums[left]
                left+=1
                mid+=1

            else:
                # simply traverse
                mid+=1

        return nums