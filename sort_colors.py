'''
APPROACH-1

Did it run on leet code: Yes
Time complexity: 0(N) but two passes
Space Complexity: 0(1)

Algorithm:
Counting number of 0's, 1's, 2's and then writing in the array
'''

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        count = [0,0,0]
        for num in nums:
            count[num] +=1
        
        j=0
        for i in range(len(nums)):
            #print(nums[i],count[j])
            if count[j]:
                nums[i] = j
                count[j] -= 1
            else:
                while not count[j]:
                    j+=1
                nums[i]=j
                count[j]-=1
            #print(nums[i])


'''
APPROACH-2

Did it run on leet code: Yes
Time complexity: 0(N) with only one pass
Space Complexity: 0(1)

Algorithm:
- Have three pointers forZero,current,forTwo

- Traverse through array whenever you encounter 0 in current arrat swap with forZero pointer.
- Traverse through array whenever you encounter 2 in current arrat swap with forTwo pointer.
- Traverse through array whenever you encounter 1 do nothing.

So we are individually sorting 0 and 2 and we are automatically taken care of 1.

'''

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
        forZero,current,forTwo = 0,0, len(nums)-1
        
        while current<=forTwo:
            if nums[current]==0:
                #print(forZero,current)
                nums[current],nums[forZero]=nums[forZero],nums[current]
                forZero+=1
                current+=1
            elif nums[current]==2:
                #print(forTwo,current)
                nums[current],nums[forTwo]=nums[forTwo],nums[current]
                forTwo-=1
            else:
                current+=1
                
                
        