#One way to solvee the three sum problem  optimally is to follow 2 pointer approach in forst for loop for every I find the j=cobination of low and high such tht the target 0 is reached.
#Time Complexity: O(n^2)
#Space Complexiity: O(n)
def threeSum(arr):
    result = list()
    if (arr is None or len(arr)==0):
        return result
    n = len(arr)
    for i in range(n-2):
        if (i > 0 and arr[i] == arr[i-1]):
            continue
        low = i + 1
        high = n
        while(low < high):
            summ = arr[i] + arr[low] + arr[high]
            if summ ==0:
                result.append([arr[i],arr[low],arr[high]])
                low = low+ 1
                high = high -1
                while (low < high and arr[low] == arr[low-1]):
                    low  = low + 1
                while (low < high and arr[high] == arr[high-1]):
                    high = high -  1
            elif summ < 0:
                low = low + 1
            else:
                high = high - 1
    return result
    

arr = [-1,0,1,2,-1,-4]
rees = threeSum(arr)
print(rees)