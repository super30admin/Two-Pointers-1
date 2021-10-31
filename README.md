# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
# Time Complexity=O(n)
# Space Complexity=O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l=0
        r=len(nums)-1
        m=0
        while m<=r:
            if nums[m]==0:
                nums[l],nums[m]=nums[m],nums[l]
                l+=1
                m+=1
            elif nums[m]==2:
                nums[r],nums[m]=nums[m],nums[r]
                r-=1
            else:
                m+=1
        

## Problem2 (https://leetcode.com/problems/3sum/)
# Time Complexity=O(n^2)
# Space Complexity=O(n)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        def twosum(nums,i,ans):
            j=i+1
            h=set()
            while j<len(nums):
                c=-nums[i]-nums[j]
                if c in h:
                    ans.append([nums[i],nums[j],c])
                    while j+1<len(nums) and nums[j]==nums[j+1]:
                        j+=1
                h.add(nums[j])
                j+=1
            return ans        
        
        ans=[]
        nums.sort()
        for i in range(len(nums)):
            if nums[i]>0:
                break
            if i==0 or nums[i-1]!=nums[i]:
                ans=twosum(nums,i,ans)
        return ans
        
        
        

## Problem3 (https://leetcode.com/problems/container-with-most-water/)
# Time Complexity=O(n)
# Space Complexity=O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        h=len(height)-1
        ma=0
        while l<h:
            ma=max(ma,min(height[l],height[h])*(h-l))
            if height[l]<height[h]:
                l+=1
            else:
                h-=1
        return ma