class Solution:
    #Time Complexity:
    # O(nlon) for sorting the nums
    # O(n)for 1st for loop
    # O(n) for inside while loop
    #  hence Time Complexity = O(nlogn)+(n*n) = O(n*n)
    # Space Complexity: O(1)
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums is None or len(nums) == 0:
            return []

        result = []
        # Sort the input list to facilitate the two-pointer approach
        nums.sort()

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:  # Skip duplicates for the first element
                continue
            if nums[i] > 0:  # If the current number is greater than 0, break out of the loop
                break

            low = i + 1
            high = len(nums) - 1
            while low < high:
                triplet = nums[i] + nums[low] + nums[high]
                
                if triplet == 0:  # Found a valid triplet
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    # Skip duplicates for the second element
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    # Skip duplicates for the third element
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                # If the sum is less than zero, move the low pointer to the right to increase the sum
                elif triplet < 0:
                    low += 1
                # If the sum is greater than zero, move the high pointer to the left to decrease the sum
                else:
                    high -= 1

        return result
