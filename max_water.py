class Solution:
	def maxArea(self, height: List[int]) -> int:
		res=0
		start=0
		end=len(height)-1
		while start<end:
			area=(end-start)*min(height[end],height[start])
			res=max(res,area)
			if height[end]>height[start]:
				start+=1
			else:
				end-=1
		return res
    
    
    # tc o(n), sc constant
