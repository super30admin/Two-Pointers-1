'''
PROBLEM 1

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)

- Use 3 pointers, front=0, mid=0 and back=len(nums)-1.
- mid will be tracking the elements and we can swap with front if mid is 0 and swap with back of mid is 2
- at the end, elements before front pointer will be all 0's, all elements after back pointer will be all 2's, all elements between front and abck will be all 1's


'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # [1,0,2]
        #  ^
        front=0
        mid=0
        back=len(nums)-1
        
        while(mid<=back):
            
            if nums[mid]==0:
                nums[front], nums[mid] = nums[mid], nums[front]
                front+=1
                mid+=1
            elif nums[mid]==2:
                nums[back], nums[mid] = nums[mid], nums[back]
                back-=1
            elif nums[mid]==1:
                mid+=1
            print(nums)


'''
PROBLEM 2

TIME COMPLEXITY: O(N^2)
SPACE COMPLEXITY: O(1)

- traverse the array and for each element, take two pointers that will be used to decide other two numbers that might result to 0
- for an element at index i, pointers look for other candidate elements from index i+1(j) to end of array(k)
- if the sum of three numbers < 0, move pointer j to i+1 or else move pointer k to i-1


'''

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = set()
        
        for i in range(0,len(nums)):
            if i>0 and nums[i] == nums[i-1]:
                continue
            
            a = nums[i]
            j = i+1
            k = len(nums) -1
            
            while j<k:
                b, c = nums[j], nums[k]
                
                if b+c > 0 - a:
                    k -=1
                elif  b+c < 0 - a:
                    j +=1
                else:
                    ans.add((a,b,c))
                    k -=1
                    j +=1
        return ans

'''
PROBLEM 3

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)

- start with two pointers, i=0 and j=len(nums)-1 and calculate the area formed by heights at indexes i and j
- move the pointer i forward if i<j or otherwuse move pointer j backward 
- maintain a global variable that maintains the maximum area


'''


class Solution:
    def maxArea(self, nums: List[int]) -> int:
        
        i=0
        j=len(nums)-1
        maxi=0
        while(i<j):
            height= min(nums[i], nums[j])
            width= j-i
            
            maxi= max(maxi, height*width)
            
            if nums[i]<nums[j]:
                i+=1
            else:
                j-=1
        return maxi