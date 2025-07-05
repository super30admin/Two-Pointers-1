'''
15 Three sum
https://leetcode.com/problems/3sum/description/

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.


Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

Solution:
1. Brute Force: Run 3 nested loops to search for nums[i], nums[j], nums[k].
To avoid duplication of triplets, sort the triplet and add it to a hash set.
Time: O(N^3), Space: O(1) (# Space is O(1) we don't count the space used for storing the output)

2. Sort and binary search: Sort the array in ascending order. Pick the first element in the outer loop. Pick the second element in the inner loop. Search for the third element using binary search.
Time: O(N^2 log N), Space: O(1)

3. Hashing: Run two nested loops. In the outer loop, we get nums[i]. In the inner loop, we get nums[j]. We can use hashing to find the third element as
nums[k] = K - nums[i] - nums[j].
Time: O(N^2), Space: O(N)

4. Two pointer:
Step 1: Sort the array A first.

Step 2: For each index i=0,...,N-2, choose the 1st ele at the ith index

Step 3: Initialize left pointer = i+1, right pointer = N-1. (The left and right pointer serve as the indices of the 2nd and 3rd elements respectively.

Step 4: Now, we have 3 elements - A[i], A[left], A[right]. Compute the sum of three elements. If sum = target, add the triplet to a set and increment left by 1 and decrement right by 1. If sum < target, increment left. If sum > target, decrement right.

Step 5: a) If left < right, go back to Step 4.
        b) If left == right, go back to Step 1.

Step 6: Return triplet

https://youtu.be/KtacpvlKbGs?t=1667

Time: O(N log N + N^2) = O(N^2), Space: O(1)

'''

from collections import defaultdict

def three_sum_v1(A, K):
    ''' Brute force'''
    N = len(A)
    if N <= 2:
        return []
    result = set()
    for i in range(N-2):
        for j in range(i+1, N-1):
            for k in range(j+1, N):
                if A[i] + A[j] + A[k] == K:
                    triplet = sorted([A[i], A[j], A[k]])
                    result.add(tuple(triplet)) # can't add list to set since lists are mutable and hash keys must be immutable
    result = [k for k in result]
    return result

def three_sum_v2(A, K):
    ''' Sort and binary search'''
    def binary_search(A, tgt, s, e):
        N = len(A)
        if N == 0:
            return -1 # not found
        while s <= e:
            mid = s + (e-s)//2 # same as int((e+s)/2) but prevents overflow
            if A[mid] == tgt:
                return mid
            elif A[mid] > tgt:
                e = mid-1
            else: # A[mid] < tgt:
                s = mid+1
        return -1 # not found

    B = A.copy() # shallow copy (create a copy so that it doesn't alter the original array which is used by other functions)
    B = sorted(B)
    N = len(B)
    if N <= 2:
        return []
    result = set()
    for i in range(N-2): # # O(N)
        for j in range(i+1,N-1): # O(N)
            target = K - B[i] - B[j]
            k = binary_search(B, target, j+1, N-1) # O(log N)
            if k != -1:
                triplet = sorted([B[i], B[j], B[k]])
                result.add(tuple(triplet)) # can't add list to set since
    result = [k for k in result]
    return result

def three_sum_v3(A, K):
    ''' Hashing'''
    N = len(A)
    if N <= 2:
        return []
    result = set()
    for i in range(N-2):
        map = defaultdict(int)
        for j in range(i+1,N-1):
            target = K - A[i] - A[j]
            if target not in map:
                map[A[j]] = j
            else:
                k = map[target]
                triplet = sorted([A[i], A[j], A[k]])
                result.add(tuple(triplet))
    result = [k for k in result]
    return result

def three_sum_v4(A, K):
    ''' Two-pointer'''
    N = len(A)
    if N <= 2:
        return []
    result = set()
    A = sorted(A) # O(N log N)
    i = 0
    for i in range(N-2):
        if i > 0 and A[i] == A[i-1]: # skip duplicates (only to run loop faster)
            continue
        first = A[i]
        if first > K:
            break
        left, right = i+1, N-1
        while (left < right):
            second = A[left]
            third = A[right]
            sum = first + second + third
            if sum == K:
                result.add((first, second, third))
                left += 1
                right -= 1
                while left < right and A[left] == A[left-1]: # skip duplicates
                    left += 1
                while left < right and A[right] == A[right+1]: # skip duplicates
                    right -= 1
            elif sum < K:
                left += 1
            else:
                right -= 1
    return list(result)

def three_sum(A,K,method):
    if method == 1: # brute force
        triplets = three_sum_v1(A,K)
    elif method == 2: # sort and binary search
        triplets = three_sum_v2(A,K)
    elif method == 3: # hashing
        triplets = three_sum_v3(A,K)
    elif method == 4: # two-pointer
        triplets = three_sum_v4(A,K)
    else:
        print(f" Invalid method ")

    return triplets

def run_three_sum():
    tests = [([-1,0,1,2,-1,-4], 0, {(-1,0,1), (-1,-1,2)}),
             ([-1,0,1,2,-1,-4,0,0,-1,-1,2], 0,  {(0, 0, 0), (-1, 0, 1), (-1, -1, 2), (-4, 2, 2)})]
    for test in tests:
        A, K, ans = test[0], test[1], test[2]
        for method in [1,2,3,4]:
            triplets = three_sum(A, K, method)
            print(f"\nA = {A}")
            print(f"Target sum = {K}")
            print(f"Method {method}: Triplets = {triplets}")
            print(f"Pass: {all([t in ans for t in triplets])}")

run_three_sum()
