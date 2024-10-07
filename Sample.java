// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//75. Sort Colors
class Solution(object):
    def sortColors(self, nums): //T.C -> O(N)
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        left = 0
        right = len(nums) - 1
        mid = 0

        while mid <= right:

            if nums[mid] == 2:
                nums[mid],nums[right] = nums[right],nums[mid]
                right-=1
            elif nums[mid] == 0:
                nums[mid],nums[left] = nums[left],nums[mid]
                left+=1
                mid+=1
            else:
                mid+=1
        return nums

//15. 3Sum
class Solution(object):
    def threeSum(self, nums): //T.C -> O(N*N), S.C -> O(1)
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        target = 0
        result=[]
        nums.sort()

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            first_idx = nums[i]

            new_target = target - first_idx

            low = i+1
            high = len(nums) - 1

            while(low < high):
                if nums[low] + nums[high] == new_target:
                    result.append([first_idx,nums[low],nums[high]])
                    low+=1
                    high-=1

                    while low < high and nums[low] == nums[low-1]: #remove duplicate elements
                        low+=1

                    while low < high and nums[high] == nums[high+1]: 
                        high-=1

                elif nums[low] + nums[high] > new_target:
                    high-=1
                else:
                    low+=1
        return result

// 11. Container With Most Water

class Solution(object):
    def maxArea(self, height): //T.C -> O(N), S.C -> O(1)
        """
        :type height: List[int]
        :rtype: int
        """
        low = 0
        high = len(height) - 1
        max_val = 0

        while low <= high:
            h = 0
            w = high - low

            if(height[low] < height[high]):
                h = height[low]
                low+=1
            else:
                h = height[high]
                high-=1
            
            max_val = max(max_val,h*w)
        return max_val
