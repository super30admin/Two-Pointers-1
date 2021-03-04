// Time Complexity :O(N^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Here we use two pointers along with the number we are looking at.
// First we sort the input array , and then look at the first index and keep the left pointer at the next element and right pointer at the last element.
// Whenever these three values sum up to 0 we add it to the result.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
			
      if(nums == null || nums.length == 0)
        return result;
      
      Arrays.sort(nums);
      for(int i=0;i<nums.length-2;i++)
      {
    	//if the current item is same as previous then that solutions is already there in the result
        if(i > 0 && nums[i]==nums[i-1])
        {
          continue;
        }
        int low = i+1;
        int high = nums.length-1;
        while(low<high)
        {
          int sum = nums[i] + nums[low] +  nums [high];
          if(sum==0)
          {
            List<Integer> list = Arrays.asList(nums[i],nums[low],nums[high]);
            result.add(list);
            low++;
            high--;
            //if the left pointer element is same as the previous element then we dont want to check this.
            while(low<high && nums[low]==nums[low-1])
            {
              low++;
            }
          //if the right pointer element is same as the next element then we dont want to check this.
            while(low<high && nums[high]==nums[high+1])
            {
              high--;
            }
          }
          //go towards right closer to 0
          else if(sum<0)
          {
            low++;
          }
        //go towards left closer to 0
          else
          {
            high--;
          }
        }
      }
      return result;
    }
}