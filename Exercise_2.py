## Problem2 (https://leetcode.com/problems/3sum/)
# Time Complexity: O(nlogn) + O(n2) => O(n2)
#   # sort - O(nlogn)
    # two pointers - n2 (n square)
# Space complexity - O(1)
    

from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res =[]

        nums.sort()
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            low = i+1
            high = len(nums)-1
            while( low < high):
                sum = nums[i] + nums[low] + nums[high]

                if sum == 0:
                    res.append([nums[i], nums[low], nums[high]]) 
                    low +=1
                    high -=1
                    while(low < high and nums[low] == nums[low-1]):
                        low+=1
                    while low < high and nums[high] == nums[high+1]:
                        high-=1
                elif sum < 0:
                    low += 1
                else:
                    high -= 1 
                    
        return res    

if __name__ == "__main__":
    solObj = Solution()
    nums = [-1,0,1,2,-1,-4]
    print(solObj.threeSum(nums))