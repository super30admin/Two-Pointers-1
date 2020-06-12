// Time Complexity : (O)n^2 (sorting nlog n and n2)
// Space Complexity : (O)1
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : out of bound exception for [0] and wrong anser for [0,0,0,0]. forget to skip the duplicate in outer index i 

// Take each element in array and use two pointer approach to find zero sum
// Sort the array then move the low and high pointer based on the calculated sum.
// increase low pointer if sum is less since the array is sorted we know that low pointer always have minimum element
// decrease high pointer if calculated sum is greater

class Solution {
    func threeSum(_ numbers: [Int]) -> [[Int]] {
      if numbers.isEmpty || numbers.count < 3 {
          return [[Int]]()
      }  
      let length = numbers.count  
      var result = [[Int]]()  
      // sort 
      var nums = numbers  
      nums.sort()
      for i in 0..<length-2 {
          var low = i + 1
          var high = length - 1
          //skip i duplicate  
          if (i > 0) && (nums[i - 1] == nums[i]) {
              continue;
          }
          
           while low < high {
               let sum = nums[i] + nums[low] + nums[high]
               if sum == 0 {
                result.append([nums[i],nums[low],nums[high]])   
                low += 1
                high -= 1   
                //skip duplicate left 
                while low < high && nums[low] == nums[low-1] {
                    low += 1
                }   
                //skip duplicate right
                while low < high && nums[high] == nums[high+1] {
                    high -= 1
                } 
               }else if sum > 0 {
                   high -= 1
               } else {
                   low += 1
               }
           }
      }
      return result  
        
    }
}