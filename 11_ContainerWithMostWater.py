#  Time Complexity : O(n)
#  Space Complexity : O(1)


class Solution:
    def maxArea(self, height):
        n = len(height)
         
        # take two pointer which will point intially fist and last element of the array respectively.
        low = 0
        high = n-1

        # set maximum area aeaa to 0
        maxA = 0

        # loop will iterate until both pointers points same element or low < high
        while low < high :

            # after each iteration it will reset the maximum area 
            # from the current maximum and (area = minimum between two height * distance between two pointer(widhth))
            maxA = max(maxA , min(height[low], height[high]) * (high - low))

            # after resetting the maxArea ,it will check both current height, and find min height between them
            # whichever pointer is pointing the smaller hieght, that pointer's will decrease or incerese according to high or low
            if (height[low]) < (height[high]):
                low = low + 1
            else:
                high = high - 1
        return maxA

obj = Solution()
print(obj.maxArea([1,8,6,2,5,4,8,3,7]))