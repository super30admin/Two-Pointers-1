// TC: O(nlogn + n^2) = O(n^2)
// SC: O(1) -> no extra space used
// Did it run successfully on Leetcode? : Yes
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> result = new ArrayList();
     if ( nums == null || nums.length == 0)
         return result;
      Arrays.sort(nums);
      
      for ( int i = 0; i < nums.length-2; i++)
      {
          // because the array is sorted. if nums[i] is > 0, then next elements will also be > 0, so there will be no triplet that sums to 0 in such a case, so just break the loop and return the result
          if ( nums[i] > 0) 
              break;
          
          if (i > 0 && nums[i] == nums[i-1]) // to avoid duplicates
              continue;
          
          int low = i+1;
          int high = nums.length-1;  
          
          while ( low < high)
          {
              int sum = nums[i] + nums[low] + nums[high];
              if ( sum == 0)
              {
                  List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
                  result.add(list);
                  low++;
                  high--;
                  
                  
                  while (low < high && nums[low] == nums[low-1])  // to avoid duplicates
                      low++;
                  while (low < high && nums[high] == nums[high+1])  // to avoid duplicates
                      high--;                   
              }
              else if ( sum > 0)
              {
                  high--;
              }
              else
              {
                  low++;
              }
          }
      }
   return result;
  } 
}
