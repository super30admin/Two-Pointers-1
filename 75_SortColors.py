"""
Leetcode - https://leetcode.com/problems/sort-colors/
TC- O(N), SC - O(1)
Lecture - https://www.youtube.com/watch?v=kg8MORzM-LM&ab_channel=%7BS30%7D
Challenge - It was tricky to understand what each pointer mean to do and when to move the pointer.
FAQ-
Buildup- start of with suggest writing our own sorting algorithm and later optimize it to the solution below (3 pointer)
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are
 adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]

Constraints:
n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
"""

'''
Ideation - 
Taking a 3 pointer approach, we have three pointers pointing to our three unique elements, 0, 1 and 2 respectively.
We keep moving out middle pointer and at any point if we encounter 0 or 2, we switch it with its respective low and high

If we encounter 2, the element at high could either be 0 or 1, If it's 0, we will have to treat it again to switch it
with low.
If we encounter 0, we switch it with low. Our low would never have 2 because by that point we will already have moved it
to the end so we can move our mid pointer marking it as processed.
If we encounter 1, we move on with our search for 1 or 2 and send them to their right position.

Our algorithm terminates when our mid reaches our first '2', ie, high, or in other words, mid > high.

NOTE- This approach only works with sorting three distinct elements in an unsorted array
'''


class Solution:
    def sortColors(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        curr = 0
        low = 0
        high = len(nums) - 1
        # equals here for the case where curr==high== {0}. 0 here needs to be placed in the right position too
        while curr <= high:
            # curr won't change in the below situation since we might have to re-remove it in case high=0 and mid=2.
            # 2 will always go to the end
            if nums[curr] == 2:
                # swap curr and high
                tmp = nums[high]
                nums[high] = nums[curr]
                nums[curr] = tmp
                high -= 1
            # 0 will always go to the beginning.
            # we can move our curr here since we would never have our curr = 2 after swap (since we already processed
            # left if it was two and moved it to the end)
            elif nums[curr] == 0:
                # swap curr and low
                tmp = nums[low]
                nums[low] = nums[curr]
                nums[curr] = tmp
                low += 1
                curr += 1
            else:
                curr += 1

        return nums


colors = [2, 2, 0, 2, 0, 1, 1]
sortedColors = Solution().sortColors(colors)
print(sortedColors)
