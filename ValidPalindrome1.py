"""
https://leetcode.com/problems/valid-palindrome/

"""


class Solution:
    def isPalindrome(self, s: str) -> bool:
        """
        1. cross all the alphanumeric characters inside the while loop from the left ith side and the right jth side
        2.   and then finally check if the the ith ptr is equal to jth pt
        O(n), O(1)
        """
        low = 0
        high = len(s) - 1
        while low < high:
            while low < high and not s[low].isalnum():
                low += 1
            while low < high and not s[high].isalnum():
                high -= 1
            """we have crossed all alphanuemrics"""
            if s[low].lower() != s[high].lower():
                return False
            low += 1
            high -= 1
        return True






