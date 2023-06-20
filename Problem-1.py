# Time Complexity = O(N)
# Space Complexity = O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        length_of_array= len(nums)
        l_pointer=0
        m_pointer=0
        r_pointer=length_of_array-1
        while m_pointer <= r_pointer:
          if(nums[m_pointer] == 2):
             nums[m_pointer],nums[r_pointer] = nums[r_pointer],nums[m_pointer]
             r_pointer -= 1

          elif (nums[m_pointer] == 0):
             nums[l_pointer],nums[m_pointer] = nums[m_pointer],nums[l_pointer]
             l_pointer +=1
             m_pointer +=1
          else:
             m_pointer += 1
        return nums



     
     