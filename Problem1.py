class Problem1:
	def SortColors(self, arr):
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

if __name__ == '__main__':
	sc = Problem1()
	arr = [2,0,2,1,0,1]
	sc.SortColors(arr)
	print(arr)