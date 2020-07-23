# Time Complexity : O(n)
# Space Complexity: O(1)
# Works on leetcode: yes 
# Approach: We keep 3 pointers - red,white,blue and partion the array into 4 parts - 3 colors and unclassified. In start
# all elements are unclassified. We iterate from start as long as the white pointer is less than ble pointer. IF white pointer
# is red, we exchange them, if white is white, we just move it forward. And if whilte pointer is black, we exchange them 
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        r,w,b = 0,0, len(nums)-1
        while w<=b:
            if nums[w]==0:
                nums[w],nums[r] = nums[r],nums[w]
                w+=1
                r+=1
            elif nums[w]==1:
                w+=1
            else:
                nums[w],nums[b] = nums[b],nums[w]
                b-=1