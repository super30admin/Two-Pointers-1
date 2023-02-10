# // Time Complexity : O(n**2)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums == None or len(nums) == 0: # checking for null condition
            return []
        result = []
        nums.sort() # sorting the array
        for i in range(len(nums)): # for every nums[i] we will declare its next element as low and last element as high
            low = i+1
            high = len(nums)-1
            if nums[i] > 0: # since the target is 0 every element in the sorted list will not give the sum as 0 so we break it here to optimize the solution
                break
            if i !=0 and nums[i] == nums[i-1]: # avoiding duplicacy of outer loop element
                continue
            while(low<high):
                total = nums[i] + nums[low] + nums[high] # checking the sum for all 3 indexes and if it matches the terget we add the 3 elements in the result
                if total == 0:
                    temp = [nums[i], nums[low], nums[high]]
                    result.append(temp)
                    low += 1
                    high -= 1
                    while(low<high and nums[low]==nums[low-1]): # avoiding duplicacy for inner loop
                        low += 1
                    while(low<high and nums[high]==nums[high+1]):
                        high -= 1
                elif total < 0:
                    low += 1
                else:
                    high -=1
        return result