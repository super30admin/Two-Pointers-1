class Problem3:



	def FindLargestContainer(self, arr):



		low = 0



		high = len(arr) - 1



		max_area = 0



		while low < high:



			area = min(arr[low], arr[high]) * (high - low)



			if area > max_area:



				max_area = area



			if arr[low] > arr[high]:



				high -= 1



			else:



				low += 1



		return max_area







if __name__ == '__main__':



	flc = Problem3()



	print(flc.FindLargestContainer([1,8,6,2,5,4,8,3,7]))