import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> result =new ArrayList<>();
         if(nums== null || nums.length==0) return result;
        
        Arrays.sort(nums);
        for(int i=0;i< nums.length-2 ;i++)
        {
        //
            if(i> 0 && nums[i]==nums[i-1]) continue;
        int low =i+1;int high =nums.length-1;
           
            while (low < high)
            { int k=nums[i]+nums[low]+nums[high];
                
                  if (k==0)
                  {
                      List<Integer> innerlist=Arrays.asList(nums[i],nums[low],nums[high]);
                      result.add(innerlist);
                      low++;high--;
                while(low < high && nums[low]==nums[low-1])low++;
                while(low < high && nums[high]==nums[high+1])high--;
                      
                  } else if ( k < 0 ){
                    low++;
                  }  else
                    high--;
            }
        
          
        }
         return result;
    }
}