class Solution:
    def validPalindrome(self, s: str) -> bool:
        """
        1. we cross all equal values on left and right
        2. if left pts crossed right pointer its true
        3. else we return or of two functions with found ==true
        """

        def helper(string, low, high, found):
            while low < high and string[low] == string[high]:
                low += 1
                high -= 1
            if low >= high:
                return True
            ###important condition
            if not found and string[low] != string[high]:
                return helper(s, low + 1, high, True) or helper(s, low, high - 1, True)
            return False

        return helper(s, 0, len(s) - 1, False)

#     def validPalindrome(self, s: str) -> bool:
#         def helper(string, start, end, found):
#             while start<end and string[start]==string[end]:
#                 start+=1
#                 end-=1
#             if start>=end:
#                 return True
#             if not found and string[start]!=string[end]:
#                 return helper(s, start, end-1, True) or helper(s, start+1, end, True)
#         return helper(s, 0, len(s)-1, False)

