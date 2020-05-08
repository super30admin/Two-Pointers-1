"""
// Time Complexity :O(n2) where n is numbers in array/ Used for and while loop
// Space Complexity :O(n) memory is used to store the triplet.
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :Failed when coins=NA

//Explanation:
Check if pointer+low+high = target -> Add in result, low+=1 and high-=1
if pointer+low+high < target -> low+=1
elif pointer+low+high > target-> high+=1
when low>high -> go to the next pointer
"""
def threeNumberSum(array, targetSum):
  pointer=0
  low,high=0,0
  rs,result=[],[]
  array.sort()

  for pointer in range(len(array)):
    low = pointer+1
    high = len(array)-1
    while(low < high):
      if (array[pointer]+array[low]+array[high])<targetSum:
        low = low+1
      elif (array[pointer]+array[low]+array[high])>targetSum:
        high = high-1
      elif (array[pointer]+array[low]+array[high])==targetSum:
        rs.append(array[pointer])
        rs.append(array[low])
        rs.append(array[high])
        result.append(rs)
        rs = []
        low = low+1
        high = high-1
  return result

if __name__ == "__main__":
  array = [12, 3, 1, 2, -6, 5, -8, 6]
  print(threeNumberSum(array,16))
