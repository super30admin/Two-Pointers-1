#Time Complexity O(N) One pass for traversing list array
#Space Complexity O(1)
#It successfully runs on the leetcode

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        l, r , m = 0, len(nums) - 1, 0
        while m<=r:
            if nums[m]==0:
                nums[l], nums[m]= nums[m], nums[l]
                l+=1
                m+=1
            elif nums[m]==2:
                nums[r], nums[m]= nums[m],nums[r]
                r-=1
            elif nums[m]==1:
                m+=1