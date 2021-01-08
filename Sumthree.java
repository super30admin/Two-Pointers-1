import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//time complexity o(n^3)
//space complexity o(n^2)
public class Sumthree {
	 public List<List<Integer>> threeSum(int[] nums) {

		 List<List<Integer>> list = new ArrayList<List<Integer>>();
		 List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		 for(int i=0;i<nums.length;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            {
	                for(int k=j+1;k<nums.length;k++)
	                {
	                    if(nums[i]+nums[j]+nums[k]==0)
	                    {
	                        list.add(Arrays.asList(nums[i],nums[j],nums[k]));
	                    }
	                }
	            }
	        }
		 for(int i=0;i<list.size();i++)
		 {
		Collections.sort(list.get(i));
		 }
		 System.out.println(list);
		 for(int i=0;i<list.size();i++)
		 {
			 list1=list.stream() 
             .distinct() 
             .collect(Collectors.toList());  
		 }
		 return list1;
	    }
		 

}
