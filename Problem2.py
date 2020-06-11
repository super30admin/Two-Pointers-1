# Time Complexity : O(n2)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    def threeSum(self,nums):
        result = []
        if not nums:
            return result

        nums.sort()
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] >0:
                break
            low = i+1 
            high = len(nums)-1 
            while low < high:
                sum_ = nums[i] + nums[low] + nums[high]
                if sum_ == 0:
                    result.append([nums[i],nums[low],nums[high]])
                    low += 1 
                    high -= 1 
                    while (low < high and nums[low] == nums[low-1]):
                        low += 1 
                    while (low < high and nums[high] == nums[high+1]):
                        high -= 1
                elif sum_ < 0:
                    low += 1 
                else:
                    high -= 1 
        return result 

if __name__ == "__main__":
    s = Solution()
    # nums = [-1, 0, 1, 2, -1, -4]
    nums = [0,0,0,0]
    res = s.threeSum(nums)
    print(res) 