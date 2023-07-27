'''
Problem: 3Sum
Time Complexity: O(n*n), where n is given elements
Space Complexity: O(1)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        sort the array
        iterate the array and for each element get left and right pointer
        if sum is greater than 0, shift right
        if sum is less than 0 then shift left
        else record it
'''

class Solution:

    def gettwosum(self,arr, i, result ):
        left = i+1
        right = len(arr)-1
        while left < right:
            target = arr[i] + arr[left] + arr[right]
            if target< 0:
                left+=1
            elif target>0:
                right-=1
            else:
                result.append([arr[i], arr[left],arr[right]])
                left+=1
                right-=1
                while left<right and arr[left]==arr[left-1]:
                    left+=1

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        result = []
        nums.sort()
        for i in range(n):
            if i==0 or nums[i]!=nums[i-1]:
                self.gettwosum(nums, i, result)
        
        return result
        