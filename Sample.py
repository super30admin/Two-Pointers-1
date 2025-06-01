# Problem 1: Sort colors
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l=m=0
        n=len(nums)
        h=n-1

        while m <= h:
            if nums[m] == 0:
                nums[l], nums[m] = nums[m], nums[l]
                l += 1
                m += 1
            elif nums[m] == 1:
                m += 1
            else:  
                nums[m], nums[h] = nums[h], nums[m]
                h -= 1



# Problem 2: 3 Sum
# Time Complexity : O(n^2)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        res=set()
        nums.sort()
        for i in range(n-2):
            if i>0 and nums[i]==nums[i-1]:
                continue
            l=i+1
            h=n-1
            t=0-nums[i]
            while (l<h):
                if nums[l]+nums[h]==t:
                    res.add((nums[i], nums[l], nums[h]))
                    while l < h and nums[l] == nums[l + 1]:
                        l += 1
                    while l < h and nums[h] == nums[h - 1]:
                        h -= 1
                    l+=1
                    h-=1
                elif nums[l]+nums[h]<t:
                    l+=1
                else:
                    h-=1
        return list(res)
                


# Problem 3: Container with most water
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def maxArea(self, height: List[int]) -> int:
        n=len(height)
        l=0
        r=n-1
        ma=0
        while (l<r):
            ma=max(ma, min(height[l], height[r])*(r-l))
            if height[l] < height[r]:
                l+=1
            else:
                r-=1
        
        return ma


