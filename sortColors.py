# As taugn in class, it is german flag problem, hence I used 3 pointers to track 0, current element and 2 and moved them ccordingly to achieve in plce sorting
#Time Complexity: O(n)
#Space Complexity: O(1)
def sortColors(arr):
    left = 0
    right = len(arr)-1
    current = 0

    while (current <= right):
        if (arr[current] == 0):
            temp = arr[current]
            arr[current] = arr[left]
            arr[left] = temp
            left = left + 1
            current = current + 1
        elif (arr[current] == 2):
            temp = arr[current]
            arr[current] = arr[right]
            arr[right] = temp
            right = right - 1
        else:
            current = current + 1
    print(arr)


arr = [2,0,0,1,1,2]
sortColors(arr)