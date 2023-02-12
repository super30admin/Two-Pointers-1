"""
Rasika Sasturkar
Brute force:
    Time Complexity: O(n^3)
    Space Complexity: O(1)
Using 2 pointers:
    Time Complexity: O(n^2)
    Space Complexity: O(1)
Using Hashing:
    Time Complexity: O(n^2)
    Space Complexity: O(n)
"""


def threeSum(nums):
    """
    We fix one element and find all the triplets using 2sum hashing method
    on the remaining 2 elements.
    """
    # null case
    if nums is None:
        return []

    n = len(nums)

    # brute force
    #
    # result_set = set()
    # for i in range(n - 2):
    #     for j in range(i + 1, n - 1):
    #         for k in range(j + 1, n):
    #             if nums[i] + nums[j] + nums[k] == 0:
    #                 result = [nums[i], nums[j], nums[k]]
    #                 result = sorted(result)
    #                 result = tuple(result)
    #                 result_set.add(result)

    # using 2 pointers
    # result_set = []
    # nums = sorted(nums)
    # for i in range(n - 2):
    #     if nums[i] > 0:
    #         break
    #     # outer duplicacy
    #     if i != 0 and nums[i] == nums[i - 1]:
    #         continue
    #     low = i + 1
    #     high = n - 1
    #
    #     while low < high:
    #         total = nums[i] + nums[low] + nums[high]
    #         if total == 0:
    #             l1 = [nums[i], nums[low], nums[high]]
    #             result_set.append(l1)
    #             low += 1
    #             high -= 1
    #
    #             # inner duplicacy
    #             while low < high and nums[low] == nums[low - 1]:
    #                 low += 1
    #             while low < high and nums[high] == nums[high + 1]:
    #                 high -= 1
    #         elif total > 0:
    #             high -= 1
    #         else:
    #             low += 1

    # using hashing
    result_set = set()

    for i in range(n - 1):
        comp = 0 - nums[i]
        hash_set = set()
        for j in range(i + 1, n):
            k = comp - nums[j]
            if k in hash_set:
                res = sorted([nums[i], nums[j], k])
                res = tuple(res)
                result_set.add(res)
            else:
                hash_set.add(nums[j])
    return result_set


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    print(threeSum(nums=[-1, 0, 1, 2, -1, -4]))  # returns {(-1, 0, 1), (-1, -1, 2)}
    print(threeSum(nums=[0, 1, 1]))  # returns set()
    print(threeSum(nums=[0, 0, 0]))  # returns {(0, 0, 0)}


if __name__ == "__main__":
    main()
