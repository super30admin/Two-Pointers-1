'''
75 Sort Colors (aka Dutch National Flag)
https://leetcode.com/problems/sort-colors/description/

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function or without doing a frequency count.

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

Solution:
1. Sorting: Use quick sort (in-place sorting)
Time: O(N log N), Space: O(1)

2. Count sort:
Using a hash map, count the no. of 0's, 1's, 2's. Then,
retrieve the value of the keys 0,1,2 (in this order). But we shouldn't be using frequency count as stated in the problem.
Time: O(N), Space: O(1) (space is O(1) since the no. of keys are limited)

3. Two pointers 1:
1st pass: Move all 0s to the left
Initialize two pointers - left=0, mid=0.
while mid <= N-1:
    if nums[mid] == 0
        swap(mid, left)
        left += 1
        mid += 1
    else:
        mid += 1

2nd pass: Move all 2s to the right
We know left point to the index after the last 0
Init mid = left
while mid <= right: # O(N)
    if nums[mid] == 2:
        swap(nums, mid, right)
        right -= 1
    else: # nums[mid] = 1 here
        mid += 1

Time: O(2N), Space: O(1)

3. Three pointers:
Initialize three pointers - left=0, mid=0, right=N-1
left tracks 0 (red), mid tracks 1 (white), right tracks 2 (blue)
Use the mid to traverse from left to right and make decisions at each index.

while mid < right:
If nums[mid] == 2:
    swap nums[mid], nums[right]
    right-- (Why? Since we moved a 2 to the right position,we are ready to explore the next position. Hence, we move the right pointer one step to the left)
    Don't move mid!! (Why? Because if nums[right] were to be 1 before the swap, then after the swap, nums[mid] would get a 1. But if left and mid are at the same position, then moving the mid would leave the left position holding a 1 which is incorrect! For eg, try doing mid++ with nums = [0,1,2,0])
elif nums[mid] == 0:
    swap nums[mid], nums[left]
    left++ (Why? Since we moved a 0 to the left position, we are ready to explore the next position. Hence, we move the left pointer one step to the right)
    mid++ (Why? Since left has already moved ahead by 1 position, mid cannot stay before left. Hence, we move mid one step to the right)
else: nums[mid] == 1
    mid++ (Why no swap? because we want to place 1 at the mid and we found that 1 is already at the mid)

https://youtu.be/nTpBCqvW66E?t=2494

https://youtu.be/tp8JIuCXBaU?t=519 (interesting new visualization using extended array: 0 lies in [0,low-1], 1 lies in [low,mid-1], unsorted nos. lie in [mid,high], 2 lies in [high+1,N-1])
https://youtu.be/tp8JIuCXBaU?t=937 (dry run using the new visualization)

Time: O(N), Space: O(1)

'''
import copy

def swap(nums, i, j):
    nums[j], nums[i] = nums[i], nums[j]


def sort_colors_1(nums):
    '''
    Two pointer solution
    '''
    N = len(nums)
    if N == 0:
        return None

    left, right = 0, N-1
    mid = left
    while mid <= N-1: # O(N)
        if nums[mid] == 0:
            swap(nums, mid, left)
            # At this point, nums[left] = 2 is guaranteed
            # Hence, increment left by 1
            left += 1

            # But increment mid as well, since mid cannot stay behind left
            mid += 1
        else:
            mid += 1

    mid = left
    while mid <= right: # O(N)
        if nums[mid] == 2:
            swap(nums, mid, right)
            # At this point, nums[right] = 2 is guaranteed
            # Can't guarantee nums[mid] is 2. Hence, decrement right by 1
            # but do not increment mid since nums[mid] might contain a 2
            right -= 1
        else: # nums[mid] = 1 here
            mid += 1
    return

def sort_colors_2(nums):
    '''
    Three pointer solution: It combines the 2 passes of the two pointer solution into a single pass
    '''
    N = len(nums)
    if N == 0:
        return None

    left, right = 0, N-1
    mid = left

    while mid <= right:
        if nums[mid] == 2:
            swap(nums, mid, right)
            # nums[right] has a 2 now, decrement right by 1 position
            right -= 1
        elif nums[mid] == 0:
            swap(nums, mid, left)
            # nums[left] has a 0 now, increment left by 1 position
            left += 1

            # Since left has incremented and nums[left] is 0, mid
            # is forced to increment by 1 position
            mid += 1
        else: # nums[mid] == 1
            # nothing to swap, increment mid by 1 position
            mid += 1
    return


def run_tests():
    tests = [([2,0,2,1,1,0], [0,0,1,1,2,2]),
             ([2,0,1],[0,1,2]),
             ([2,1,0,0],[0,0,1,2]),
             ([0,1,2,0],[0,0,1,2])
    ]
    for test in tests:
        nums, ans = test[0], test[1]
        print(f"\nnums = {nums}")
        nums1 = copy.copy(nums)
        nums2 = copy.copy(nums)
        sort_colors_1(nums1)
        sort_colors_2(nums2)
        print(f"sort colors 1 = {nums1}")
        print(f"sort colors 2 = {nums2}")
        passed = (ans == nums1 == nums2)
        assert passed == True, f"Test case failed"
        print(f"Pass: {passed}")

    print(f"\nDONE")

run_tests()