"""
https://leetcode.com/problems/palindrome-number/
"""
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 or (x % 10 == 0 and x // 10 != 0):
            return False
        rev = 0
        while x > rev:  ##log x base 10
            pop = x % 10  ##O(1)
            x //= 10  ##O(1)
            rev = rev * 10 + pop  ###O(1)
        return x == rev or x == rev // 10
        ##X=1
        ###rev=12
        ###x=121

#         """1. If negative number
#         2. last digit is 0 so first digit also needs to be 0"""
#         if x<0 or (x%10==0 and x//10!=0):
#             return False
#         original=x
#         rev=0
#         while original!=0: ##log x base 10
#             pop=original%10 ##O(1)
#             original//=10##O(1)
#             rev=rev*10+pop ###O(1)
#             """if rev becomes greater than original, it means we have already processed half of the string"""
#         if x!=rev:
#             return False
#         return True


