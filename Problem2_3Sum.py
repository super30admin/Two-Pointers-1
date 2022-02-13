#Time Complexity: O(n^2) + O(nlogn) => O(n^2)
#Space Complexity: O(n) for result
#Leetcode: Yes

'''
Approach: Take one element and use two pointers on the rest to check if the sum is equal to 0.
If sum is equal to 0, it is a valid triplet.
'''

class Solution:
    def threeSum(self, nums):
        nums = sorted(nums)
        result = []
        if nums == None or len(nums) == 0:
            return []

        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i-1]:
                continue;

            low, high = i+1, len(nums)-1
            while(low<high):
                sum_ = nums[i]+nums[low]+nums[high]
                if sum_ == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low+=1
                    high-=1
                    while(low<high and nums[low] == nums[low-1]):
                        low += 1
                    while(low<high and nums[high] == nums[high+1]):
                        high -= 1
                elif sum_<0:
                    low += 1
                else:
                    high -= 1 
        return result

obj = Solution()
nums = [-1,0,1,2,-1,-4]
print(obj.threeSum(nums))