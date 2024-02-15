class Solution(object):
    def __init__(self):
        self.result = []

    def sortColors(self, a):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        time: O(n)
        space: O(1)
        [2,0,2,1,1,0]

        """
        red, white, blue = 0, 0, len(a)-1
        while white <= blue:
            if a[white] == 0:
                a[white], a[red] = a[red], a[white]
                red += 1
                white += 1
            elif a[white] == 1:
                white += 1
            else:
                a[white], a[blue] = a[blue], a[white]
                blue -= 1

    def twoSum(self, nums, i):
        j, k = i+1, len(nums) - 1
        while j < k:
            sm = nums[i] + nums[j] + nums[k]
            if sm < 0:
                j += 1
            elif sm > 0:
                k -= 1
            else:
                self.result.append([nums[i], nums[j], nums[k]])
                j += 1
                k -= 1
                while j < k and nums[j] == nums[j-1]:
                    j += 1
                while j < k and nums[k] == nums[k+1]:
                    k -= 1

    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        time: O(n*n)
        space: O(1)
        """
        nums.sort()
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i != 0 and nums[i] == nums[i-1]:
                continue
            self.twoSum(nums, i)
        return self.result

    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        time: O(n)
        space: O(1)
        """ 
        l, r = 0, len(height)-1
        ans = 0
        while l < r:
            area = min(height[l], height[r]) * (r - l)
            ans = max(ans, area)
            if height[l] > height[r]:
                r -= 1
            else:
                l += 1
        return ans
