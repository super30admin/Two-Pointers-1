import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Time Complexity :O(N^2) + O(NlogN) = O(N^2)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :yes


public class ThreeSum {
	
	// The efficient way to solve this problem is to first sort the whole array and thn traverse from left to right
	// for each number at index 'i' do two sum from i+1 to n-1 and find the triplet which is 0
	// use inner while loop to jump over to duplicates
	
	
	  public List<List<Integer>> threeSum(int[] nums) {
	        
	        List<List<Integer>> result = new ArrayList<>();
	        Arrays.sort(nums);
	        
	        int low = 0;
	        int high = nums.length;
	       
	        if(nums==null || nums.length==0 || nums[high-1] <0 || nums[low]==0)
	            return result;
	 
	        
	        while(low < high-2){  
	           
	            while(low>0 && low < high-2 && nums[low]==nums[low-1])
	                      low++;
	            
	                int a = nums[low]; 

	                int left = low+1;
	                int right = high-1;
	             
	            while(left < right){
	                int b = nums[left];
	                int c = nums[right];
	              
	                if(a+b+c ==0)
	               {
	                   List<Integer> temp = new ArrayList<>();
	                   temp.add(a);
	                   temp.add(b);
	                   temp.add(c);
	                   result.add(temp);
	                    left++;
	                    right--;
	                  while(left<right && nums[left]==nums[left-1])
	                      left++;

	                  while(left<right && nums[right]==nums[right+1])
	                    right--;    
	               }
	                else if(a+b+c > 0){
	                    right--;
	                }
	                else {
	                    left++;
	                }
	                  
	            }   
	            
	            low++;
	        }
	        return result;
	      
	        }
}
