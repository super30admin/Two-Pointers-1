# Time Complexity: O(n^2), We sort the array initially then run 2Sum on the remaining elements - O()
# Space Complexity: O(1), Only extra space we use is for variables, not arrays.
def threeSum(nums: list[int]) -> list[list[int]]:
    if not nums or len(nums) < 3:
        return []
    nums = sorted(nums) # O(nlogn)
    n = len(nums)
    result = []
    for i in range(n): # O(n)
        if i != 0 and nums[i] == nums[i-1]:
            continue
        if nums[i] > 0: # All elements left over are positive elements, there's no hope to get a solution.
            return result
        low = i+1
        high = n-1
        while low < high:
            s = nums[i] + nums[low] + nums[high]
            if s == 0:
                result.append([nums[i], nums[low], nums[high]])
                low +=1
                high -=1;
                while (low < high and nums[low] == nums[low-1]): 
                    low+=1
                while (low < high and nums[high] == nums[high+1]): 
                    high-=1
            elif s > 0:
                high -=1
            else:
                low +=1
    return result