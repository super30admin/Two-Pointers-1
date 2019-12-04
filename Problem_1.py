# Runs on leet code
# Time complexity:  O(n)
# Memory complexity:  O(n) for dictionary solution and O(1) for two pointers solution


'''
Dictionary solution

Creating a dictionary which saves count of each color. Manipulating original array with the count values in dictionary.
'''
'''
Two pointers solution

Left pointer starts at 0 th position and right pointer starts at last position. The final goal is to bring all 0's before 
left pointer, all 2's after right pointer and all 1's between left and right pointer.

If encountered value at left index is 0, we pop nums[left] and append it at 0th position.
If encountered value at left index is 1, we just increment left pointer.
If the encountered value at left index is 2, we pop nums[left] and append it to the end of the list.
'''

class Solution:
      def sortColors_dictionary(self,nums):
              if not nums:
                  return []
              d = {}
              for i in nums:
                  if i not in d:
                      d[i] = 1
                  else:
                      d[i] += 1
              index = 0
              for i in range(0,3):
                  if i in d:
                      j = 0
                      while(j < d[i]):
                          nums[index] = i
                          index += 1
                          j += 1
              print(nums)

      def sortColors_two_pointers(self,nums):
              left = 0
              right = len(nums)

              while left < right:
                  if nums[left] == 0 and left != 0:
                      nums.pop(left)
                      nums.insert(0, 0)
                      left += 1
                  elif nums[left] == 2:
                      nums.pop(left)
                      nums.append(2)
                      right -= 1
                  else:
                      left += 1
              print(nums)

