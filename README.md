# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)

# TC - O(n) and SC - O(n)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        color = [0,0,0]
        for n in nums:
            color[n] += 1
        print(color)
        i, j = 0, 0
        while i < len(nums):
            if color[j] == 0:
                j += 1
                continue
            else:
                nums[i] = j
                color[j] -= 1
                i += 1
        return nums

## Problem2 (https://leetcode.com/problems/3sum/)
# TC O(n2) O(n)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        a, output = 0, set()
        nums.sort()
        
        while a < len(nums) - 1:
            b = a + 1
            c = len(nums) - 1
            
            while b < c:
                total = nums[a] + nums[b] + nums[c]
                
                if total == 0:
                    output.add((nums[a], nums[b], nums[c]))
                    b += 1
                    c -= 1
                    
                    while b < c and nums[b] == nums[b - 1]:
                        b += 1
                    while b < c and nums[c] == nums[c + 1]:
                        c -= 1
                
                elif total > 0:
                    c -= 1
                else:
                    b += 1
            
            a += 1
            # Skip duplicates for the 'a' pointer
            while a < len(nums) - 1 and nums[a] == nums[a - 1]:
                a += 1
        
        return list(output)


## Problem3 (https://leetcode.com/problems/container-with-most-water/)
# TC O(n) SC O(1)
class Solution:
    def maxArea(self, height) -> int:
        l, r = 0, len(height)-1
        max_area = 0
        while l < r:
            breadth = min(height[l], height[r])
            curr_area = breadth * (r - l)
            print(curr_area)
            max_area = max(curr_area, max_area)
            if height[l] < height[r]:
                l += 1
            elif height[l] > height[r]:
                r -= 1
            else:
                l += 1
                r -= 1
        
        return max_area

