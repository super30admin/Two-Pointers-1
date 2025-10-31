# Find pairs of 3 numbers whose summation equals to the target which is 0 over here

# Time: O(n^3)
# Space: O(1)
# Using nested iterations but make sure the sub array is already not in the array
# We are sorting the array before appending because we don't want duplicates

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                for k in range(j+1,len(nums)):
                    if nums[i] + nums[j] + nums[k] == 0:
                        triplet = [nums[i], nums[j], nums[k]]
                        triplet.sort()
                        if triplet not in result:
                            result.append(triplet)

        return result
    

# Time: O(n^2)
# Space: O(n)

# we fix one number and then just perform two sum on the remaining array
# i is the fixed pointer the j loop is for two sum check wether the compliment is there in the two_set or not
# Reset the set for two sum again because the fixed pointer changed and we might count the numbers that come earlier to it
# at the end while returning convert it to array 
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = set()
        for i in range(len(nums)):
            target = 0 - nums[i]
            two_set = set()
            for j in range(i+1,len(nums)):
                complement = target - nums[j]
                if complement in two_set:
                    result.add(tuple(sorted([nums[i], nums[j], target - nums[j]])))
                else:
                    two_set.add(nums[j])

        return [list(t) for t in result]
    
# There is a binary search solution too basically fix one pointer and do binary search on rest of the array



# Time: O(n^2)
# Space: O(1)

# We have 1 fixed point and perform two pointers on the remaining array
# If we find similar numbers just skip them because we don't want duplicates
# Look for duplicates at the fixed pointer too
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []

        for i in range(len(nums)):
            # Don't want the same element
            if i > 0 and nums[i] == nums[i - 1]:
                # To skip the iteration
                continue

            low = i + 1
            high = len(nums) - 1

            # < and not <= because we don't want to use the same element again
            while low < high:
                val = nums[i] + nums[low] + nums[high]

                if val == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    # updating before skipping because we don't want to compare the current element wiht the previous one we want to compare the next element with the used one
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                elif val < 0:
                    low += 1
                elif val > 0:
                    high -= 1

        return result
    