class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        """
        Time Complexity: O(n^2)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach: 
            - We first sort the array 
            - We are basically traversing over the whole array taking element at i as 
            first element and doing two sum over the other arrays using the two pointer approach
            - First we take element at i as the first element of the sum
            - Then we take two pointers one at i+1th index and another towards the end of the list (n-1)
            - We do the sum of first element and element at two pointer indexes
                - if the sum is zero 
                    - we create a list of all the three elements and append it to res list
                    - we then check for duplimacy if the element at p2 index is same as p1 indexm
                    we decrease p2 by 1 until we find a unique element 
                    - we do the same for p1, we check with p1+1th index, 
                    we increase p1 by 1 until we find a unique element
                - if the sum is > 0 
                    - we decrease p2 by 1 (since, we sorted this array)
                - if the sum is < 0
                    - we increase p1 by 1 (since, we sorted this array)
        """        
        nums.sort()
        n = len(nums)
        res = list()

        for i in range(0, n):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            p1 = i + 1 
            p2 = n-1 
            while p1 < p2:
                first = nums[i]
                second = nums[p1]
                third = nums[p2]
                total = first + second + third
                if total > 0:
                    p2 -= 1
                elif total < 0:
                    p1 += 1
                else:
                    res.append([first, second, third])
                    while (p1 < p2 and nums[p2] == nums[p2-1]):
                        p2 -= 1
                    while (p1 < p2 and nums[p1] == nums[p1+1]):
                        p1 += 1
                    p2 -= 1
                    p1 += 1
        return res
