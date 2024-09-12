class Solution:
	def threeSum(self, nums: List[int]) -> List[List[int]]:
		nums.sort()
		ans = []
		for i in range(len(nums)-2):
			if i>0 and nums[i] == nums[i-1]:
				continue
			if nums[i]>0:
				break
			low, high = i+1, len(nums)-1
			while(low<high):
				curr_sum = nums[i] + nums[low] + nums[high]
				if curr_sum==0:
					ans.append([nums[i], nums[low], nums[high]])
					low+=1
					high-=1
					while(low<high and nums[low] == nums[low-1]):
						low+=1
					while(low<high and nums[high] == nums[high+1]):
						high-=1
				elif curr_sum>0:
					high-=1
				else:
					low+=1
		return ans


#time complexity - O(nlogn + n^2) = O(n^2) //sort first and then double iteration

#space complexity - O(1)

#all test cases passed