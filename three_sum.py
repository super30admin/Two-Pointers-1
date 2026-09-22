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

Time: O(N log N + N^2) = O(N^2), Space: O(1)

https://youtu.be/KtacpvlKbGs?t=1667

'''
def three_sum_v1(nums, K):
    '''
    Brute Force
    '''
    N = len(nums)
    if N <= 2:
        return []
    result = set()
    for i in range(N):
        for j in range(i+1, N):
            for k in range(j+1, N):
                if nums[i] + nums[j] + nums[k] == K:
                    result.add(tuple(sorted([nums[i], nums[j], nums[k]])))
    return result

def three_sum_v2(nums, K):
    '''
    Sort and Binary Search
    '''
    def binary_search(A, s, e, tgt):
        if len(A) == 0:
            return -1
        while s <= e:
            mid = s + (e-s)//2
            if A[mid] == tgt:
                return mid
            elif A[mid] < tgt:
                s = mid + 1
            else:
                e = mid - 1
        return -1

    N = len(nums)
    if N <= 2:
        return []

    nums = sorted(nums)
    result = set()
    for i in range(N):
        for j in range(i+1, N):
            target = K - nums[i] - nums[j]
            if j + 1 <= N-1:
                k = binary_search(nums, j+1, N-1, target)
                if k != -1:
                    result.add(tuple([nums[i], nums[j], nums[k]]))
    return result

def three_sum_v3(nums, K):
    ''' Hashing'''
    N = len(nums)
    if N <= 2:
        return []
    result = set()
    for i in range(N): # O(N)
        a = nums[i]
        h = set()
        for j in range(i+1, N): # O(N)
            b = nums[j]
            c = K - a - b
            if c in h:
                result.add(tuple(sorted([a, b, c])))
            else:
                h.add(b)
    return result

def three_sum_v4(nums, K):
    ''' Two-pointer'''
    N = len(nums)
    if N <= 2:
        return []
    result = [] # remove duplicates w/o using a set()
    nums = sorted(nums) # O(N log N)
    for i in range(N-2):
        if nums[i] >= 0 and K < nums[i]:
            break
        if i > 0 and nums[i] == nums[i-1]:
            continue

        left, right = i+1, N-1
        while left < right:
            sum = nums[i] + nums[left] + nums[right]
            if sum == K:
                result.append([nums[i], nums[left], nums[right]])
                left += 1
                right -= 1
                while left < right and nums[left] == nums[left -1]:
                    left += 1
                while left < right and nums[right] == nums[right+1]:
                    right -= 1
            elif sum > K:
                right -= 1
            else: # sum < K
                left += 1
    return set([tuple(t) for t in result])


def three_sum(nums, target, method):
    if method == 1: # brute force
        triplets = three_sum_v1(nums.copy(), target)
    elif method == 2: # sort and binary search
        triplets = three_sum_v2(nums.copy(), target)
    elif method == 3: # hashing
        triplets = three_sum_v3(nums.copy(), target)
    elif method == 4: # two-pointer
        triplets = three_sum_v4(nums.copy(), target)
    else:
        print(f" Invalid method ")

    return triplets


def run_three_sum():
    tests = [([-1,0,1,2,-1,-4], 0, {(-1,0,1), (-1,-1,2)}),
             ([-1,0,1,2,-1,-4,0,0,-1,-1,2], 0,  {(0, 0, 0), (-1, 0, 1), (-1, -1, 2), (-4, 2, 2)}),
             ([0, 0, 0], 0, {(0,0,0)}),
    ]
    for test in tests:
        nums, target, ans = test[0], test[1], test[2]
        for method in [1,2,3,4]:
            triplets = three_sum(nums, target, method)
            print(f"\nnums = {nums}")
            print(f"Target sum = {target}")
            print(f"Method {method}: Triplets = {triplets}")
            print(f"Pass: {all([t in ans for t in triplets])}")

run_three_sum()
