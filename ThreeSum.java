import java.util.List;
import java.util.*;


// Time Complexity : O(nlogn)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*Approach
-> sort the array
1) take 3 pointers starting from left, left+1 and right 
2) now we just see if sum ==0 then add the numbers present at all indexes to a arrayList
3) increment the pointers and check for duplicate elements with help of inner while loops or by choosing List<List<Integer>> as Set<List<Integer>>
4) array needs to be sorted as we come to know when to increase the pointers
5) if sum>0 decrement the high pointer as it points to a greater value
6) similarly increment low as it indicates lesser value sum<0


*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> all= new HashSet();
        
        Arrays.sort(nums);
        
        if(nums.length==0)
            return new ArrayList(all);
        
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k)
            {
                if((nums[i]+nums[j]+nums[k])==0)
                {
                    all.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                if((nums[i]+nums[j]+nums[k])>0)
                {
                    k--;
                }
                else if((nums[i]+nums[j]+nums[k])<0)
                    j++;
            }
            
            
            
        }
        
        return new ArrayList<>(all);
        
        
    }
}