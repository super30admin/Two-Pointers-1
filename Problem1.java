

//Time :O(n)
//Space :O(1)
public class Problem1 {
	  public void sortColors(int[] nums) {
	        if(nums==null || nums.length==0)
	            return;
	        
	        int curr=0,l=0;
	        int r=nums.length-1;
	        
	        while(curr<=r){
	            if(nums[curr]==2){
	                swap(curr,r,nums);
	                r--;
	            }
	            
	            else if(nums[curr]==0){
	                swap(curr,l,nums);
	                l++;
	                curr++;
	            }
	            else{
	                curr++;
	            }
	            
	        }
	    }
	    
	    private void swap(int i,int j,int[] nums){
	        int temp=nums[i];
	        nums[i]=nums[j];
	        nums[j]=temp;
	        return;
	    }
	    
	    public static void main(String args[]) {
	    }
}
