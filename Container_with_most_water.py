class Solution:
	def maxArea(self, height: List[int]) -> int:
		if not height:
			return 0
		area = 0
		left, right = 0, len(height)-1
		while(left<right):
			area = max(area, (right-left)*min(height[left],height[right]))
			if height[left]<height[right]:
				left+=1
			else:
				right-=1
		return area

#time complexity - O(n), as in the worst case the whole height array is traversed

#space complexity - O(1)

#all test cases passed