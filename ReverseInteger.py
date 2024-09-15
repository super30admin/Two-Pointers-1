class Solution:
    def reverse(self, x: int) -> int:
        if x < 0:
            sign = False
        else:
            sign = True
        x = abs(x)
        rev = 0
        while x != 0:
            pop = x % 10
            print(pop)
            x //= 10
            if (rev > (2 ** 31) // 10) or ((rev < -((2 ** 31) - 1) / 10)):
                return 0
            if rev == 2 ** 31 / 10 and (rev > 7 or rev < -8):
                return 0
            rev = rev * 10 + pop
        if sign == False:
            return -1 * rev
        else:
            return rev

