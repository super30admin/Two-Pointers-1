# logic -
# use a for loop for the ith element and the 2 pointer approach for the remaining list
# Time - O(n^2)
# Space - O(1)

def threeSum(self, nums: List[int]) -> List[List[int]]:
    output = []
    nums.sort()  # --> O(nlogn)

    # base case
    if len(nums) == 0 and nums == None:
        return []

    if len(nums) < 3:
        return output

    #Time complexity is n^2 for the combined for and while loop
    for i in range(len(nums) - 2):
        # skip the duplicate triplets
        if i > 0 and nums[i] == nums[i - 1]:
            continue
        left = i + 1
        right = len(nums) - 1
        while left < right:
            s = nums[i] + nums[left] + nums[right]
            if s < 0:
                left += 1
            if s == 0:
                output.append([nums[i], nums[left], nums[right]])
                left += 1
                right -= 1
                # skip the duplicate triplets
                while left < right and nums[left] == nums[left - 1]: left += 1
                while left < right and nums[right] == nums[right + 1]: right -= 1
            if s > 0:
                right -= 1
    return output
