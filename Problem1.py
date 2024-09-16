class Problem1:
	def SortColors1(self, arr):
		# Time Complexity : O(n) where n is the seize of the array
		# Space Complexity : constant space. Because we have to store three colors and count for each of them. The size of hashmap is always three or less than three.
		# Passed on Leetcode
		color_map = {}
		# creating a hash map for storing the count of each color
		for i in arr:
			if i not in color_map:
				color_map[i] = 0
			color_map[i] += 1
		j = 0

		# Edit the exixting array to add these values in sorted order
		for i in range(3):
			for k in range(color_map.get(i, 0)):
				arr[j] = i
				j += 1

	def SortColors2(self, arr):
		low = 0
		mid = 0
		high = len(arr) - 1
		while mid < high:
			if arr[mid] == 1:
				mid += 1
			elif arr[mid] == 0:
				arr[low], arr[mid] = arr[mid], arr[low]
				low += 1
				mid += 1
			else:
				arr[high], arr[mid] = arr[mid], arr[high]
				high -= 1

if __name__ == '__main__':
	sc = Problem1()
	arr = [2,0,2,1,0,1]
	sc.SortColors1(arr)
	print(arr)
	arr = [2,0,2,1,0,1]
	sc.SortColors2(arr)
	print(arr)