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

2. Hash map:
Using a hash map, count the no. of 0's, 1's, 2's. Then,
retrieve the value of the keys 0,1,2 (in this order). But we shouldn't be usign a frequency count as stated in the problem.
Time: O(N), Space: O(1) (space is O(1) since the no. of keys are limited)

3. Two pointer:
Initialize three pointers - left=0, mid=0, right=N-1
left tracks 0 (red), mid tracks 1 (white), right tracks 2 (blue)
Use the mid to traverse from left to right and make decisions at each index.

while mid < right:
If A[mid] == 2:
    swap A[mid], A[right]
    right-- (Why? Since we moved a 2 to the right position,we are ready to explore the next position. Hence, we move the right pointer one step to the left)
    Don't move mid!! (Why? Because if A[right] were to be 1 before the swap, then after the swap, A[mid] would get a 1. But if left and mid are at the same position, then moving the mid would leave the left position holding a 1 which is incorrect! For eg, try doing mid++ with A = [0,1,2,0])
elif A[mid] == 0:
    swap A[mid], A[left]
    left++ (Why? Since we moved a 0 to the left position, we are ready to explore the next position. Hence, we move the left pointer one step to the right)
    mid++ (Why? Since 0 is the least element, we cannot anticipate another value at that position. Hence, we move mid one step to the right)
else: A[mid] == 1
    mid++ (Why no swap? because we want to place 1 at the mid and we found that 1 is already at the mid)

https://youtu.be/nTpBCqvW66E?t=2494

https://youtu.be/tp8JIuCXBaU?t=519 (interesting visualization using extended array: 0 lies in [0,low-1], 1 lies in [low,mid-1], unsorted nos. lie in [mid,high], 2 lies in [high+1,N-1])

Time: O(N), Space: O(1)

'''
def swap(A, i, j):
    A[j], A[i] = A[i], A[j]

def sort_colors(A):
    N = len(A)
    if N == 0:
        return None

    left, right = 0, N-1
    mid = left

    while mid <= right:
        if A[mid] == 2:
            swap(A, mid, right)
            right -= 1
            #mid += 1
        elif A[mid] == 0:
            swap(A, left, mid)
            mid += 1
            left += 1
        else: # A[mid] == 1
            mid += 1

def run_sort_colors():
    tests = [([2,0,2,1,1,0], [0,0,1,1,2,2]), ([2,0,1],[0,1,2]), ([2,1,0,0],[0,0,1,2]), ([0,1,2,0],[0,0,1,2])]
    for test in tests:
        A, ans = test[0], test[1]
        print(f"\nA = {A}")
        sort_colors(A)
        print(f"A (sorted) = {A}")
        print(f"Pass: {ans == A}")

run_sort_colors()