# ## Problem2 (https://leetcode.com/problems/3sum/)
# // Time Complexity :O(nlogn)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach

def threeSum(nums):
    # sorting nums
    nums = sorted(nums)
    # result list
    result = []
    n = len(nums)
    # i will go till n-2 becasue we are doing twoSum on the rest of the elements
    for i in range(n - 2):
        # if the element is > 0 we will not find a triplet
        if nums[i] > 0:
            break
        # for duplicate elements
        if i > 0 and nums[i] == nums[i - 1]:
            continue
        # left and right ptrs for the rest of the array
        l = i+1
        r = n - 1
        # iterating through the rest of the array elements
        while (l < r):
            # finding the total
            total = nums[i] + nums[l] + nums[r]
            # if it equals to the target
            if total == 0:
                result.append([nums[i], nums[l], nums[r]])
                # update ptrs
                l += 1
                r -= 1
                # internal duplicacy
                # checking while condition coz l, r getting updated
                # and check if duplicates
                while (l < r and nums[l] == nums[l-1]):
                    l += 1
                # checking while condition coz l, r getting updated
                #  and check if duplicates
                while (l < r and nums[r] == nums[r+1]):
                    r -= 1
            # if total smaller
            elif total < 0:
                l += 1
            else:
                r -= 1
    return result


nums = [-1, 0, 1, 2, -1, -4]
print(threeSum(nums))
