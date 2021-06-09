'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 75. Sort Colors

#-----------------
# Time Complexity: 
#-----------------
# O(N): One-pass over entire input array.

#------------------
# Space Complexity: 
#------------------
# O(1): Not using any auxiliary data structure. In-place substitution using
#       temporary variables

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  36 ms   (45.69 %ile)
# Space            :  14.2 MB (43.33 %ile)


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)

        if n==0:
            return []

        elif n == 1:
            return nums

        elif n == 2:
            # O(1) since there are only two elements in the array
            if nums[1] < nums[0]:
                temp = nums[0]
                nums[0] = nums[1]
                nums[1] = temp

            return nums

        else:
            # Pointer to the right-most red. Initialize w/ 0
            rightmost_red = 0 

            # Pointer to the left-most blue. Initialize w/ n-1
            leftmost_blue = n-1

            # Current index to address the elements within nums
            curr_idx = 0

            while (curr_idx <= leftmost_blue):
                if nums[curr_idx] == 0:
                    # swap element at curr_idx with element at rightmost red
                    # move curr_idx to the right and rightmost red to right
                    temp = nums[curr_idx]
                    nums[curr_idx] = nums[rightmost_red]
                    nums[rightmost_red] = temp

                    rightmost_red += 1
                    curr_idx += 1

                elif nums[curr_idx] == 1:
                    #Do nothing. Increment current index to move right. 
                    curr_idx += 1

                elif nums[curr_idx] == 2:
                    # swap element at curr_idx with element at leftmost blue
                    # move leftmost blue to the left.
                    # do nothing to current_idx, because the swapped element
                    # might be a 0 and we need to check the first condition
                    # again
                    temp = nums[curr_idx]
                    nums[curr_idx] = nums[leftmost_blue]
                    nums[leftmost_blue] = temp

                    leftmost_blue -= 1


                else:
                    #Illegal element in the array - return dummy
                    return [-1]

            return nums

