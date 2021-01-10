
/* 
 * Complexity of algorithm is O(n) ,where n is number of elements.
 *  
 * */
public class SortColors {
	
	
	  public void sortColors(int[] nums) {
	        
	        if (nums == null || nums.length == 0 || nums.length == 1) {
	           return;
	        } 
	        
	        
	        
	        int i=0,j=0;
	        int k=nums.length-1;
	        
	        while(j<=k){
	            
	          
	            if(nums[j]==0){
	                int temp= nums[j];
	                nums[j]= nums[i];
	                nums[i]=temp;
	                i++;
	                j++;
	            }else if(nums[j]==1){
	                j++;
	            }else{
	                
	                 int temp= nums[j];
	                nums[j]= nums[k];
	                nums[k]=temp;
	                k--;
	                
	            }
	                
	               
	               
	          
	    }
	    
	    
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,0,2,1,1,0};
		
		SortColors objIn= new SortColors();
		
		objIn.sortColors(nums);
		
		for(int num : nums)
			System.out.println(num);

	}

}
