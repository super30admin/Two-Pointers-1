# TC = O(n**2): O(n) for external loop * O(n) for two pointer at each external loop + O(nlogn) for sort
# SC = O(1) inplace
# We fix each index as curr element under consideration- we traverse entire array. While we are at each index, we make sure the value is unique from previously considered. Each time we perform two pointer method on the left-over elements of the array. We take care of repeated elements by skipping. Last optimization: break the loop if you find value greater than the target as if you would not find negative equivalent going forward as the array is sorted.

def threeSum(nums):
    res = []
    if not nums or len(nums) == 0:
        return res
    nums.sort()
    for i in range(len(nums)-2):
        if nums[i] > 0 : break
        if i > 0 and nums[i] == nums[i-1]: continue
        low, high = i+1, len(nums) - 1
        while low < high:
            sum = nums[i] + nums[low] + nums[high]
            if sum == 0:
                li = [nums[i], nums[low], nums[high]]
                res.append(li)
                low += 1
                high -= 1
                while low < high and nums[low] == nums[low-1]: low+=1
                while low < high and nums[high] == nums[high+1]: high-=1
            elif sum > 0:
                high -= 1
            else:
                low += 1
    
    return res

nums = [-1,0,1,2,-1,-4]
print(threeSum(nums))