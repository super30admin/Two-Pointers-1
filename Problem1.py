#Time Complexity: O(n)
#Space Complexity: O(1)

#Accepted on Leetcode

#Approach: 
#Keep two pointers to track 0's and 2's respectively and one pointer to iterate
#Any time 0 is encountered, push it to the start and increase 0's pointer, when 1 is encountered push it to the end and decrement its pointer (ignore 1's)
#Break as soon as 0 and 2 pointers meet, since 0's and 2's are sorted, 1 will always be in the correct position

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        A = nums
        n = len(A)
        i = 0 #track 0's
        j = 0 #iterator
        k = n-1

        while (i < n and A[i] == 0):
            i += 1
            j += 1
        
        while (k >= 0 and A[k] == 2):
            k -= 1
        
        while j<=k:
            if A[j] == 0:
                self.swap(A, i, j)
                i+=1
                #if i>j:
                j+=1
            elif A[j] == 2:
                self.swap(A, k, j)
                k-=1
                j+=1
            else: #equals 1
                j+=1
        
        return A


    def swap(self, A, i, j):
        temp = A[i]
        A[i] = A[j]
        A[j] = temp


#TC 1
#[2, 0, 1], n = 3, i = 0, j = 0, k = 2
#[1,0,2] i = 0, j = 0, k = 1
#[1,0,2] i = 0, j = 1, k = 1
#[0,1,2] i = 1, j = 1, k = 1
#[0,1,2] i = 1, j = 2, k = 1







