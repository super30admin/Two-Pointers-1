# Time Complexity: O(N^2), it is O(nlogn + n^2)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Here we first sort the array and use binary search on the remaining array
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n:int = len(nums) - 1
        low:int = 0
        res = list()
        # hashset = set()
        nums.sort()

        # go until the 3rd last element since mid and high would be the next 2 elements
        for low in range(n-1):
            # if the first element in the sorted array is greater than zero
            # then the sum of the triplet will never be equal to zero
            if nums[low]>0:
                break
            # if the low is same as the previous row, we would have already considered the triplets formed
            # so we can skip until a new low is found
            if low>0 and nums[low] == nums[low-1]:
                continue
            mid:int = low + 1
            high:int = n
            while mid < high:
                curr_total = nums[low] + nums[mid] + nums[high]
                if curr_total==0:
                    res.append([nums[low],nums[mid],nums[high]])
                    mid+=1
                    high-=1
                    while mid < high and nums[mid] == nums[mid-1]:
                        mid+=1
                    while mid<high and nums[high] == nums[high+1]:
                        high-=1

                elif curr_total>0:
                    while mid<high and nums[high] == nums[high-1]:
                        high-=1
                    # for the last high, it will not enter the loop since the high-1 element would be a new one
                    # so we need to do it once more to get it to the new element
                    if mid<high:
                        high-=1
                else:
                    while mid < high and nums[mid] == nums[mid+1]:
                        mid+=1
                    # similar to the high pointer explanation
                    if mid<high:
                        mid+=1
        return res