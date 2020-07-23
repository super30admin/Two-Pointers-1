// Time Complexity : O(n^2 + nlogn) = 0(n^2)
//      n: number of elements
//      nlogn for sorting
// Space Complexity : O(1)
//      not counting result
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

// imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// By using a sorted array property
// As we move from left to right we get higher values
// And we move from right to left we get lesser values
class Problem2 {

    /**find three number whose sum is equal to zero */
    public List<List<Integer>> threeSum(int[] nums) {
        
        // result
        List<List<Integer>> result = new ArrayList<>();
        
        // edge case
        if(nums==null || nums.length<3)
            return result;
        
        
        int n =nums.length;
        // sorting inplace: nlogn
        Arrays.sort(nums);
        
        // iterate
        for(int i=0; i<n-2;i++){
            
            // current number not equal to previous
            if(i>0 && nums[i-1]==nums[i]) continue;
            
            // next number
            int low =i+1;
            // last number
            int high = n-1;
            
            // till in range
            while(low< high){
                
                // find the sum
                int sum = nums[i] + nums[low] + nums[high];

                // if it is zero
                if(sum==0){
                    // add to result
                    List<Integer> tempList = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(tempList);

                    // update the pointer
                    low++;
                    high--;
                    
                    // getting different number than the previous
                    while(low<high && nums[low-1]==nums[low])
                        low++;
                    
                    while(low<high && nums[high+1]==nums[high])
                        high--;     
                }
                // sum less than zero
                else if(sum<0){
                    // we increment low as we need higher sum
                    low++;
                    // getting different number than the previous
                    while(low<high && nums[low-1]==nums[low])
                        low++;
                    
                }else{
                    // we decrement high as we need lower sum
                    high--;
                    // getting different number than the previous
                    while(low<high && nums[high+1]==nums[high])
                        high--;   
                    
                }
            }
        }
        
        // result
        return result;
        
    }
}