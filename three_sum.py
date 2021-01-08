# Brute Force Approaches
# With three nested loops we can compare the sum of the numbers and check if it matches the target
# Time : O(N^3)

# Optimized Solution 1 
# Sort the array and fix one number and use binary search to get the other two numbers based on complement of target
# Sorting take O(N log N) + O(N) * O(log N) ( log N for binary search & O(N) for outer iteration) ~= O(N^2 log (N))

# Optimized Solution 2
# Sort the array and use 2 pointers to find the match. 

def threeSum(array):
    
    array.sort()
    triplets = []
    for i in range(len(array) - 2):
        if (i > 0) and array[i] == array[i-1]: # to avoid duplicate triplets if the number is same as previous we just keep continuing
            continue
        left = i + 1
        right = len(array) - 1

        while left < right:

            if array[i] + array[left] + array[right] == 0:
                triplets.append([i, left, right])
                left += 1
                right -= 1

                # to avoid duplicate triplets
                while left < right and array[left] == array[left + 1]:
                    left += 1

                while left < right array[right] == array[right - 1]:
                    right -= 1

            elif array[i] + array[left] + array[right] < 0:
                left += 1

            else:
                right -= 1

    return triplets


        