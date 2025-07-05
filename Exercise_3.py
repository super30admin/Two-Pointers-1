'''
11 Container with most water
https://leetcode.com/problems/container-with-most-water/description/

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1

Solution:
1. Brute Force: Try all possible containers and pick the largest container.
Time: O(N^2), Space: O(1)

2. Two pointer:
Step 0: Initialize the left and right pointers are 0 and N-1 respectively. Let M = area of largest container = 0

Step 1: If left < right:
        Compute the height = min(left ele, right ele), and width = right - left
        Area = height * width
        M = max(Area, M)
Step 2: Move the pointer.
    a) If A[left] < A[right] (left wall is smaller), sacrifice the left wall and preserve the right wall. Hence, left = left + 1
    b) If A[left] > A[right] (right wall is smaller), sacrifice the right wall and preserve the left wall. Hence, right = right - 1
    c) If A[left] == A[right], then move either left or right (doesn't matter). A dry run of moving left vs moving right is discussed here:
    https://youtu.be/KtacpvlKbGs?t=1029 (17:09-20:15)

https://www.youtube.com/watch?v=KtacpvlKbGs

Time: O(N), Space: O(1)

'''

def container_with_most_water(A):
    N = len(A)
    if N <= 1:
        return 0

    left, right = 0, N-1
    M = 0
    while left < right:
        h = min(A[left], A[right])
        w = right - left
        area = h*w
        M = max(M, area)

        if A[left] < A[right]:
            left += 1
        elif A[left] > A[right]:
            right -= 1
        else:
            left += 1
    return M

def run_container_with_most_water():
    tests = [([1,8,6,2,5,4,8,3,7], 49), ([1,1], 1), ([2], 0)]
    for test in tests:
        A, ans = test[0], test[1]
        area = container_with_most_water(A)
        print(f"\nA = {A}")
        print(f"Max area of water = {area}")
        print(f"Pass: {ans == area}")

run_container_with_most_water()
