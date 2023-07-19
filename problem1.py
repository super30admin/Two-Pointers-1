# Approach1 : Using sort function
# Time Complexity: O(nlogn)
# Space Complexity: O(1)
nums = [2,0,2,1,1,0]
nums.sort()
print(nums)


# Approach2 : count function
# Time Complexity: O(n^2)
# Space Complexity: O(n)
nums = [2, 0, 2, 1, 1, 0]
result = []

for num in range(min(nums), max(nums) + 1):
    result.extend([num] * nums.count(num))

print(result)


# Approach3 : count function
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        low = 0
        mid = 0
        high = len(nums)-1
        while(mid <= high):
            if nums[mid] == 2:
                self.swap(nums,mid, high)
                high -= 1
            elif nums[mid] == 0:
                self.swap(nums,low, mid)
                low += 1
                mid += 1
            else:
                mid += 1
        return nums

    def swap(self,nums: List[int], i: int, j:int):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

