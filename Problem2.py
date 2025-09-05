class Solution(object):
    # tc : O(nlogn + n*2) -> O(n*2)
    # sc : O(1)
    # ran successfully on leetcode
     def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # sort the arr, and fix the first index and in the rest of the array find nums[i] + nums[j] + nums[k] == 0
        # to find the nums[j], nums[k] i will use two pointers start from the low and from the end and keep checking if the sum of these three pointers
        # are less than 0 then i will move the start pointer to the right and if greater then the end pointer to the left and if equal we foudn a triplet
        # will save these triplets in the output array
        # to avoid the duplicates once i found a triplet i will move the start, low until i found a unique element then previous
        # once done for the ith inddex, i will move my ith to thr next unique element than previous, return the output array havign all the triplest which sum is 0

        nums.sort()
        start = 0
        end = len(nums)-1
        output = []

        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i-1]:
                i +=1
                continue

            start = i +1
            while(start< end):
                total = nums[i] + nums[start] + nums[end]
                if total < 0:
                    start +=1
                elif total > 0:
                    end -= 1
                else :
                    output.append([nums[i], nums[start], nums[end]])
                    start += 1
                    end -= 1
                    while start < end and nums[start] == nums[start-1]:
                        start +=1
                    while start < end and nums[end] == nums[end+1]:
                        end -= 1
                

        return output


        