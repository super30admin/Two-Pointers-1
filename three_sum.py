class Solution:
    def sumNumbers(self, root):
        return self.helper(root, 0)

    def helper(self, root, currNum):
        if root is None:
            return 0

        currNum = currNum * 10 + root.val

        if root.left is None and root.right is None:
            return currNum

        left = self.helper(root.left, currNum)
        right = self.helper(root.right, currNum)

        return left + right

# Time: O(n)
# Space: O(h)