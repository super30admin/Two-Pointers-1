# Leetcode link : https://leetcode.com/problems/3sum/
# Time Complexity : O(n2)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
    Brute force approach => Check for all the triplets using 3 loops starting from first index O(n3)
    
   Two pointers => The intuition behind this approach is we need to optimize either second or third inner loop in the traversal.
   One way to do that is by sorting the array and then fixing one index and then look for cumulative target which is negative of first index element.
   We need to look towards left if we need smaller sum and look towards right if we need higher sum to get a cumulative sum of zero.
   To avoid duplicates, we keep discarding elements if its equal to the prev element
'''


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # edge case when array contains less than 3 elements then no triplet can exist
        if not nums or len(nums) < 3:
            return []
        
        # intialize output
        output = []
        
        # sort array
        list.sort(nums)
        
        # traverse through the array using first index
        for i in range(len(nums)-2):
            # condition to discard same elements
            if i > 0 and nums[i-1] == nums[i]:
                continue
            # second pointer starts from the first element in the remaining subarray
            j = i+1
            # third index points to the last element
            k = len(nums) - 1
            
            # traverse for each index till the two index cross each other
            while( j < k):
                curr_sum = nums[i] + nums[j] + nums[k]
                # if sum is zero add to output and update both left and right pointers, also discard repeated elements
                if curr_sum == 0:
                    output.append([nums[i],nums[j],nums[k]])
                    j += 1
                    k -=1
                    while j < k and nums[j-1] == nums[j]:
                        j += 1
                    while j < k and nums[k+1] == nums[k]:
                        k -= 1
                # if sum is less than zero that means we might get the desired element towards the right as sorted array will tend to have higher elements towards the right
                elif curr_sum < 0:
                    j += 1
                    # increment left and then keep discarding repeated elements
                    while j < k and nums[j-1] == nums[j]:
                        j += 1
                # sum is greater and to get lesser sum we need to move towards left as we have smaller element towards left
                else:
                    k -= 1
                    # decrement right then discard repeated elements towards left
                    while j < k and nums[k+1] == nums[k]:
                        k -= 1
        # return the list of triplets
        return output
