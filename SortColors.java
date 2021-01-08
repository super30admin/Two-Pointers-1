
public class SortColors {
	 public void sortColors(int[] nums) {
	        int count=0,count1=0,count2=0,j=0;
	     for(int i=0;i<nums.length;i++)
	     {
	         if(nums[i]==0)
	             count++;
	         else if(nums[i]==1)
	             count1++;
	         else
	             count2++;
	     }
	        for(int i=0;i<count;i++){
	            nums[j]=0;
	            j++;
	        }
	        
	        for(int i=0;i<count1;i++){
	            nums[j]=1;
	            j++;
	        }
	        
	        for(int i=0;i<count2;i++)
	        {
	            nums[j]=2;
	            j++;
	        }
	    }
}
