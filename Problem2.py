class Problem2:
	def ThreeSum1(self, arr):
		# Time complexity : O(n^3) where n is the number of elements in the array
		# Space complexity : result array. No extra space being used
		# Finding every 3 elements combination from the array and adding it to the resultant array only if the sum is equal to zero
		# But this solution has duplicates in it.
		n = len(arr)
		res = []
		for i in range(n):
			for j in range(i + 1, n):
				for k in range(j + 1, n):
					if arr[i] + arr[j] + arr[k] == 0:
						temp = [arr[i], arr[j], arr[k]]
						temp.sort() # is constant time because we should always do a sort of three elements.
						if temp not in res: # this is O(n) complexity where n is the number of elements in the res array
							res.append(temp)
		return res

	def ThreeSum2(self, arr):
		res = []
		arr.sort()
		for i in range(len(arr)):
			low = i + 1
			high = len(arr) - 1
			if i > 0. and arr[i] == arr[i - 1]:
				continue
			while low < high:
				temp_sum = arr[i] + arr[low] + arr[high]
				if temp_sum == 0:
					res.append([arr[i], arr[low], arr[high]])
					low += 1
					high -= 1
					while low < high and arr[low] == arr[low - 1]:
						low += 1
					while low < high and arr[high] == arr[high + 1]:
						high -= 1
				elif temp_sum > 0:
					high -= 1
				else:
					low += 1
		return res

if __name__ == '__main__':
	ts = Problem2()
	print(ts.ThreeSum1([-1, 0, 1, 2, -1, -4]))
	print(ts.ThreeSum2([-1, 0, 1, 2, -1, -4]))