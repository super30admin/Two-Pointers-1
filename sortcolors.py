// Time Complexity :o(n*n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        for i in range(0,len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] > nums[j]:
                    nums[i], nums[j] = nums[j], nums[i]
        return nums
