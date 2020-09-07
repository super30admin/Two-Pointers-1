import java.util.*;
//Time:O(N2)
//Space : O(1)
public class Problem2 {
	 public List<List<Integer>> threeSum(int[] nums) {
	        if(nums==null || nums.length==0)
	            return new ArrayList<List<Integer>>();
	        Arrays.sort(nums);
	        
	        List<List<Integer>> res= new ArrayList<>();
	        for(int i=0;i<nums.length;i++){
	            if(i!=0 && (nums[i]==nums[i-1])) continue;
	            int l=i+1;
	            int r=nums.length-1;
	           
	            while(l<r){
	                int sum = nums[i]+nums[l]+nums[r];
	                 if(sum==0){
	                    
	                   res.add(Arrays.asList(nums[i],nums[l],nums[r]));                   
	                    l++;
	                      while(l<r && nums[l]==nums[l-1])
	                        l++;
	                      
	                    r--;
	                     while(l<r && nums[r]==nums[r+1])
	                        r--;
	                }
	                else if(sum<0){
	                    l++;
	                    while(l<r && nums[l]==nums[l-1])
	                        l++;
	                }else{
	                    r--;
	                       while(l<r && nums[r]==nums[r+1])
	                        r--;
	                }
	                
	            }
	            
	        }
	        
	        return res;
	    }
}
