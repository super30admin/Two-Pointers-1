# https://leetcode.com/problems/3sum/

# To find the three sum used the two pointer approach. By iterating through the first number make the two pointers on the rest of the array using high and low. Add the checks to skip the same triplet in the result set.

# Time Complexity- O(n2) Space Complexity- O(1)
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        n = len(nums)
        # sorting the given array
        nums.sort()
        # this is the output space that never count in complexity
        result = []
        # iterating over the array so that 1 number will be fixed out of 3 
        for i in range(n):
            # after 1st number all the element will be positive as we have sorted the array. so breaking the loop because there would be no negative to make the target 0
            if nums[i] > 0:
                break
            # need to skip the duplicate values for the 1st number so checking with precious number
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            # using two pointers to search on the right array
            low, high = i+1, n-1
            # to make sure two pointers should not cross
            while low < high:
                # add the three numbers to find the triplet
                total = nums[i] + nums[low] + nums[high]
                # if the total is greater than zero, we need to move the right pointer
                if total > 0:
                    high -= 1
                # if the total is smaller than zero, we need to move the left pointer
                elif total < 0:
                    low += 1
                # when total is zero, found the valid 3 numbers
                else:
                    result.append([nums[i], nums[low], nums[high]])
                    # move the pointer
                    low += 1
                    high -= 1
                    # to skip the duplicate value in the two pointers
                    while nums[low] == nums[low - 1] and low < high:
                        low += 1
                
        return result
    
solution = Solution()
print(solution.threeSum([-1,0,1,2,-1,-4]))