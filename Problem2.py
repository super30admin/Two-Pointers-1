#Time complexity: O(n^2)
#Space complexity: O(1)

#Accepted on Leetcode

#Approach
#Sort the array, now for each element A[i] at index (i), find two elements between i+1 and n-1 such that their sum is 0
#Since A[i] is fixed, we know elem2 + elem3 == 0, since the list is sorted put a start and end pointer at i+1 and n-1 
#Depending on whether A[start] + A[end] > 0 or < 0, increment and decrement start and end pointers to get complement of A[i], To avoid duplicates (skip duplicate elements for i, 'start' and 'end' if a triplet is found (list is sorted so keep skipping until same element is not found))

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        A = sorted(nums)
        n = len(A)
        soln = []
        
        for i in range(n):
            low = i+1
            high = n-1
            if A[i] > 0:
                break
            if i>0 and A[i] == A[i-1]:
                continue
            while low < high:
                if A[i] + A[low] + A[high] == 0:
                    soln.append([A[i],A[low],A[high]])
                    low+=1
                    high-=1
                    while low<high and A[low] == A[low-1]:
                        low+= 1
                    while low<high and A[high] == A[high + 1]:
                        high -=1
                elif A[i] + A[low] + A[high] < 0:
                    low += 1
                else: 
                    high -= 1 

        return soln


        