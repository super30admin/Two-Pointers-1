import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
       if ( nums.length<3) return result;
       Arrays.sort(nums);  // O(nlogn)
       
       for ( int i=0;i<nums.length;i++) // O(n^2)
       {
           if(i>0 && nums[i]==nums[i-1]) continue; // ignore duplicate i's
           int j= i+1;
           int k= nums.length-1;
           while(j<k){
               int sum= nums[i]+nums[j]+nums[k];
               if (sum==0) 
               {
                   result.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                   while(j<k && nums[j]== nums[j+1])j++;   // ignore duplicate j's
                   while( j<k && nums[k]==nums[k-1])k--;   // ignore duplicate k's
                   j++;
                   k--;
               }
               else if ( sum>0) k--;
               else j++;
           }
       }
        return result;
   }

   public static void main(String[] args)
   {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
   }
}
