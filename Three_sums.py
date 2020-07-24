# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach: We create a 2 pointer approach, a high and a low pointer.
# Additionally, we add a current pointer. For every current pointer, we take the next element and the last element as the
# low and high pointer respectively. Then, we keep on checking the sum of these 3 numbers, and if the sum is >0, we decrement
# the high pointer, if sum < 0, we increment the low ponter, and if sum ==0, we increment low and decrement high to eliminate
# duplicates.

def three_sums(nums):
    low = 0
    high = len(nums)-1
    current = 1

    # edge case
    if len(nums) < 3: return 0

    # first sort the array
    nums.sort()

    result = []

    for i in range(0, len(nums)-2):
        if i > 0 and nums[i-1] == nums[i]: continue

        current = i
        low = i+1
        high = len(nums)-1

        while(low<high):
            sum = nums[current] + nums[high] + nums[low]
            if sum > 0:
                high-=1
            elif sum < 0:
                low += 1
            else: # sum = 0
                result.append([nums[current], nums[high], nums[low]])
                high-=1
                low +=1
                while(low < high) and nums[low] == nums[low-1]: low+=1
                while(low < high) and nums[high] == nums[high+1]: high-=1


    return result


print(three_sums([-1,0,1,2,-1,-4]))

