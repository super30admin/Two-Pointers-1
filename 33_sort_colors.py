# June 10,2020
# Referred the solution for Method 3 : One pass
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        # eg. [2,0,2,1,1,0] = len is 6
        # OP = [ 0 0 1 1 2 2 ]

        # Method 3 : One pass

        # Time complexity : O(n)
        # The array is traversed only once, irrespective of three pointers, the pointers do not go back and forth
        # Three pointers also traverse in one direction only and once throughout the array

        # Space complexity : O(1)
        # no extra space needed for traversing
        # pointers allocate constant space

        '''
        - Since there are three values, three pointers can be though of
        - p0 and curr at the start, p2 at the end
        - Try to Keep 2 at the end of the list, 0 at the beginning, here its essential to maintain boundaries, which is taken care by
        Problems : 
        - p0 should be on 1 or 2, but not 0--> because you do not know if there exits any 0, hence necessary to NOT KEEP p0 on 0
        - p2 should be on 0 or 1, but not 2--> for thr above reason
        - When to move curr --> When curr = 1, no need to swap anything so just move curr.
        - When to stop moving curr ? --> when curr> p2, this means we have crossed p2's boundary now and everything is sorted
        - Array index out of bound error when we have [1]
        '''
        # Works in Leetcode ( All solutions )

        if len(nums) == 1 or nums == None:
            return nums

        p0 = curr = 0
        p2 = len(nums) - 1

        while p2 <= curr:  # stopping condition, curr has entered the last phase of the list

            # here array index out of is taken care by while condition :
            # because p2 is the end of the array and curr is start
            # p1 : curr will always keep incrementing and be equal or more than p1
            # p2  : condition breaks when p2>curr, this also works when we have minimum two elements

            if nums[curr] == 0:
                nums[curr], p0 = p0, curr  # constant space [something like temp implcitly used ]
                p0 += 1  # we move towards right

            elif nums[curr] == 2:
                nums[curr], p2 = p2, nums[curr]
                p2 -= 1  # we move towards left

            else:  # nums[curr] == 1
                curr += 1  # Array index out of bound error when we have [1], hence initial if conditions at the top necessary

            print(nums)

        # Method 2 : Two pass
        # Time complexity : O(n)
        # Space complexity : O(1)
        # Dictionary/List uses a constant space here of 3 keys/ 3 values only, and array is anyways overwritten so no space used
        '''
        Since we know the elements in the array are only 0 1 2, we can simply count the number of 0s 1s 2s
        Overwrite the same array with 0s, 1s, 2s in the order, we use a list / dict or may be three variables to store these counts
        Problems : 
        Do not forget to increment i in while loop
        This method may not work for cases when we do not know the elements present, they can be 012, 238, 245 etc.
        Do not make mistake of nums[0:counts[0]] = 0 , you will get type error, you need a for loop to assign values
        For dictionary : 'if 0 in counts' :  DO NOT write this ==> if '0' in counts.
        '''

        zeroC = 0
        oneC = 0
        twoC = 0

        for i in range(len(nums)):  # get all the counts
            if nums[i] == 0:
                zeroC += 1
            elif nums[i] == 1:
                oneC += 1
            else:
                twoC += 1
        print('0', zeroC, '1', oneC, '2', twoC)

        i = 0
        while zeroC:  # until count becomes 0 keep appending
            nums[i] = 0
            zeroC -= 1
            i += 1

        while oneC:
            nums[i] = 1
            oneC -= 1
            i += 1  # do not forget to increment i

        while twoC:
            nums[i] = 2
            twoC -= 1
            i += 1  # do not forget to increment i

        print(nums)

        # --------------------------------------------------------------------------------------------------
        # if you use dictionary to store the count
        '''
        counts = {}
        for num in nums: # constant space of 3
            if num in counts:
                counts[num]+=1 # increment counts if key already exists, keys are 0 1 2
            else:
                counts[num]=1 # assign value as 1 for initial count
        print(counts)

        '''

        # now we rewrite the elements in dict
        # DO NOT DO THIS if you use a dictionary to store the count
        '''
        if 0 in counts: # uses constant space
            nums = [0]*counts[0]     # counts[0] = 2, nums [ 0 0 ], appends upto position 1
            print(nums)

        if 1 in counts: # uses constant space
            nums.extend([1]*counts[1]) # do not use append , you will get a list of lists

        if 2 in counts: # uses constant space
            nums.extend([2]*counts[2]) 
        print(nums) # prints the same original
        '''

        # Method 1 : Multile pass
        # Time complexity : O(n! * n)
        # Space complexity : O(1)
        '''
        # Typical two pointer method for sorting, as we iterate through the array, array starts sorting from the end
        # Hence we loop inner for loop n! times
        # Problems : 
        # Take care of array index out of bound for inner for loop, because the first pointer will go maximum upto n-2 position
        # DO NOT return anything

        for i in range(len(nums)-1,0,-1): # excutes (n-1) times # 5 4 3 2 1, defines upto which position 1st pointer goes
            for j in range(i):            # excutes n! times 01234,0123,012,01
                if nums[j]>nums[j+1]:
                    temp = nums[j]
                    nums[j] =nums[j+1]
                    nums[j+1] = temp
            print(nums)

        '''
