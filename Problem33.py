"""
Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

"""



# dict1 = {}
# count_red, count_blue, count_white=0,0,0
# for i in range(0, len(array)):
#
#     if array[i] == 2:
#         count_red+= 1
#     elif array[i] == 1:
#         count_white+= 1
#     else:
#         count_blue+= 1
#
#
#
# print([2]* count_red + [1]* count_white + [0]*count_blue)

# Dutch National Flag Problem:
array = [2,0,2,1,1,0]

left  = 0
right = len(array)-1
curr = 0

while curr <= right:
    if (array[curr] == 2):
        array[curr], array[right] = array[right] ,array[curr]
        right-= 1

    elif array[curr] == 0:
        array[curr], array[left] = array[left], array[curr]
        curr +=1
        left +=1

    elif array[curr]== 1:
        curr+= 1

print(array)


"""

Time Complexity: 0(n)
Space Complexity: 0(1)

"""
