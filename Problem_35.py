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