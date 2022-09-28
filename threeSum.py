"""
https://leetcode.com/problems/3sum/
Approach -
a. Brute force
- Sort - check through three loops - add the list hashset - return list
TC - O(n*n*n)
SC - O(1)

b. Two pointer approach
- Use two pointers left and right and an outer loop
- If the pointer next to your current pointer is the same, then move forward, in rder to avoidduplcates
- Move till we capture a triplet, record it
- If, the pointers cross over, we have captured all triplets

TC - O(n*n log n) i.e. two sum takes TC as O(nlogn) and O(n) is used here for outer loop so the TC - O(n*n log n)
SC - O(1) --> (same for 2sum)
"""
num = [-1, 0, 1, 2, -1, -4]


def threeSum(nums):
    if nums is None or len(nums) < 3:
        return -1

    n = len(nums)
    s_set = set()
    rtnData = []

    nums.sort()

    # outer loop
    for i in range(n):
        if i > 0 and nums[i] == nums[i-1]: continue
        # if nums[i] > 0: break
        left = i+1
        right = n-1
        while left < right:
            sumVal = nums[i] + nums[left] + nums[right]
            if sumVal == 0:
                # need to convert to tuple since lists are not mutable and cannot be added to hashset
                li = tuple([nums[i], nums[left], nums[right]])
                s_set.add(li)
                # convert to list when adding to rtnData
                rtnData.append(list(li))
                # when element found move both pointers, in order to find next triplet
                left += 1
                right -= 1

                # continue to move left-right pointers, if they are same to avoid duplicates like the continue
                # statement
                # here we check left <right condition since the while loop keeps on incrementing
                while left < right and nums[left] == nums[left-1]:
                    left += 1
                while left < right and nums[right] == nums[right + 1]:
                    right -= 1
            elif sumVal < 0:
                left += 1
            elif sumVal > 0:
                right -= 1
    return rtnData

    # brute force
    # for i in range(n):
    #     for j in range(i+1, n):
    #         for k in range(j+1, n):
    #             sumVal = nums[i] = nums[j] + nums[k]
    #             if sumVal == 0:
    #                 li.append([nums[i], nums[j], nums[k]])
    #                 li.sort()
    #                 s_set.add(li)
    # return s_set


print(threeSum(num))
