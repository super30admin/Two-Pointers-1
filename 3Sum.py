#Time Complexity : O(n^2) where n is the number of elements in the array
#Space Complexity : O(1) where n is the number of elements in the array

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Iterate through a sorted array, then keeping two pointers i+1 and end of the array and run a loop against those elements and keep checking if the sum of those three elements become 0. And move the pointers accordingly to the conditions. Keep duplicate elements in mind and move the pointers ahead if we've already visited that element value previously. 

#Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        snums = sorted(nums)
        for i in range(len(nums)):
            if snums[i] > 0:
                break

            if i > 0 and snums[i] == snums[i-1]:
                continue

            l, r = i+1, len(nums)-1
            while l < r:
                tot = snums[i] + snums[l] + snums[r]
                if tot == 0:
                    result.append([snums[i], snums[l], snums[r]])
                    while l < len(nums)-1 and snums[l] == snums[l+1]:
                        l += 1
                    while r > l and snums[r] == snums[r-1]:
                        r -= 1
                    l += 1
                    r -= 1
                elif tot > 0:
                    r -= 1
                else:
                    l += 1


        return result
