# problem 1 : 75. Sort Colors : https://leetcode.com/problems/sort-colors/
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return []
        if len(nums) == 1:
            return nums
        zero, two = 0, len(nums)-1
        i = 0
        while i <= two:
            if nums[i] == 0:
                nums[i], nums[zero] = nums[zero], nums[i]
                zero +=1
                i += 1
            elif nums[i] == 2:
                nums[two], nums[i] = nums[i], nums[two]
                two -= 1
            else:
                i += 1
        return nums


# problem 2 : 15. 3Sum : https://leetcode.com/problems/3sum/
# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

from collections import Counter
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) < 2:
            return []
        def checkTwoSum(l, r, target, curr):
            while l < r:
                if nums[l] + nums[r] == target:
                    self.ans.append([nums[curr], nums[l], nums[r]])
                    while l < r and nums[l+1] == nums[l]:                        
                        l += 1
                    while l < r and nums[r-1] == nums[r]:
                        r -= 1
                    l += 1
                    r -= 1
                elif nums[l] + nums[r] < target:
                    l += 1
                else :
                    r -= 1
           
        
        self.ans = []
        nums.sort()
        for i in range(len(nums)-2):
            if nums[i] > 0:
                break
            if i == 0 or nums[i-1] != nums[i]:
                checkTwoSum(i+1, len(nums)- 1, -nums[i], i)
        return self.ans


# problem 3 : 11. Container With Most Water : https://leetcode.com/problems/container-with-most-water/
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height:
            return None
        l, r = 0, len(height)-1
        res = 0 
        while l < r :
            res = max(res,abs(l-r) * min(height[l],height[r]) )
            minEle =  min(height[l],height[r])
            if minEle == height[l]:
                l += 1
                while minEle > height[l]:
                    l += 1
                    if l >= r :
                        break
            else :
                r -=1
                while minEle > height[r]:
                    r -= 1
                    if l >= r :
                        break
        return res

