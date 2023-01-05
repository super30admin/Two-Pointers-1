#3Sum
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        tuples = []
        for i in range(n-2):
            if (i > 0 and nums[i] == nums[i-1]) :
                continue
            low = i+1
            high = n-1
            while low < high:
                sum = nums[i] + nums[low] + nums[high]
                if sum == 0:
                    pair = [nums[i], nums[low], nums[high]]
                    tuples.append(pair)
                    low+= 1
                    high-=  1
                    while(low < high and nums[low] == nums[low-1]):
                        low+=1
                    while(low < high and nums[high] == nums[high+1]):
                        high-=1
                elif sum > 0:
                    high-=1
                else:
                    low+=1
        return tuples

#Sort Colors
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        high = len(nums) - 1
        mid = 0
        for i in range(len(nums)):
            while(mid <= high):
                if(nums[mid] == 0):
                    self.swap(nums, mid, low)
                    low+=1
                    mid+=1
                elif(nums[mid] == 2):
                    self.swap(nums, mid, high)
                    high-=1
                else:
                    mid+=1
    def swap(self, nums: list[int], a: int, b: int) -> None :
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp

#Container With Most Water
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        low = 0
        high = n-1
        result = 0
        print(low, high)
        while (low < high):
            area = min(height[low],height[high])*(high-low)
            result = max(result, area)
            if(height[low] < height[high]):
                low+=1
            else:
                high-=1
        return result


