package sol;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
	   public List<List<Integer>> threeSum(int[] nums) {
		    
	        Arrays.sort(nums);
	        
	        List<List<Integer>> l2= new LinkedList<>();
	        
	        int p=0;
	      
	        
	       for( int i=0;i<nums.length;i++){
	 
	           int l=i+1;
	           int r=nums.length-1;
	           
	           while(l<r){
	          
	               if(nums[l]+nums[r]+nums[i]==0){
	               
	               List<Integer> l1= new LinkedList<>();
	               l1.add(nums[i]); l1.add(nums[l]); l1.add(nums[r]);
	               l2.add(l1);
	                     while(l<r&&nums[l+1]==nums[l]){ l++;}l++;
	           }    
	             else if  (nums[l]+nums[r]+nums[i]<0){
	                 
	                 while(l<r&&nums[l+1]==nums[l]){ l++;}l++;
	                 
	             }else{
	                 
	                 while(l<r&&nums[r-1]==nums[r]){r--;}r--;
	                 
	                 
	                 
	             }
	               
	           }
	            while(i<nums.length-1 && nums[i+1]==nums[i]){ i++;}
	           
	           
	       }
	        
	   
	        return l2;
	    }
}
