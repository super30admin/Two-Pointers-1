import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
 * Complexity of algorithm is O(n*n log n) ,where n log n for sorting is number of elements in a array.
 *  
 * */

public class ThreeSum {
	
	  public List<List<Integer>> threeSum(int[] nums) {
	        
	        List<List<Integer>> result= new ArrayList<>();
	        
	        if(nums== null || nums.length==0){
	            return result;
	        }
	        
	        Arrays.sort(nums);
	        
	        for(int i=0 ;i< nums.length-2;i++){
	           
	            
	            if(i>0 && nums[i]==nums[i-1]) continue;
	            
	           int low= i+1;
	            int high= nums.length-1;
	            
	            
	            while(low < high){
	                
	             int   sum= nums[i]+ nums[low]+nums[high];
	                
	                if(sum==0){
	                    
	                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
	                   
	                    result.add(li);
	                    low++;
	                    high--;
	                    
	                    while(low < high && nums[low]==nums[low-1]) low++;
	                    while(low < high && nums[high]==nums[high+1]) high--;
	                    
	                }else if(sum > 0){
	                    high--;
	                }else{
	                    low++;
	                    
	                }
	            }
	        }
	       
	        
	        return result;
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {-1,0,1,2,-1,-4};
		
		ThreeSum objIn = new ThreeSum();
		
		System.out.println(objIn.threeSum(nums));

	}

}
