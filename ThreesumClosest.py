

"""
https://leetcode.com/problems/3sum-closest/solution/
"""
class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        """
        Note that we may not find the exact complement number, so we check the difference between the complement and two numbers: the next higher and the previous lower.

        1. Initialize the minimum difference diff with a large value,
Sort the input array nums and Iterate through the array.
2. For the current position i, set lo to i + 1, and hi to the last index.
3. While the lo pointer is smaller than hi:
    3.1 Set sum to nums[i] + nums[lo] + nums[hi].
    3.2 If the absolute difference between sum and target is smaller than the absolute value of diff:
        3.2.1Set diff to target - sum.
    3.3 If sum is less than target, increment lo.
    3.4 Else, decrement hi.
    3.5 If diff is zero, break from the loop.
Return the value of the closest triplet, which is target - diff.

##target-nearestdiff=closestsum
        """
        nearestdif =float('inf') ##O(1)TC, SC
        nums.sort(  )###TC O(lengthofstrng*loglengthofstring)- SC- background can take anywhere upto O(n)
        for i in range(len(nums)): ##O(n square ) time,
            low = i +1
            high =len(nums ) -1
            while lo w <high: ###--O(n)
                ad d =nums[i ] +nums[low ] +nums[high]
                if abs(ad d -target ) <abs(nearestdif):
                    nearestdi f =targe t -add
                # if nearestdif==0:
                #     break
                if add > target:
                    hig h- =1
                else :
                    lo w+ =1
                if nearestdi f= =0:
                    break
            # if nearestdif
        return target -nearestdif



