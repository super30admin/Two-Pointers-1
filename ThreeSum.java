import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(n^2)
// Space Complexity : O(1)
public class ThreeSum {
	public List<List<Integer>> findThreeSum(int[] nums) {
		List<List<Integer>> result= new ArrayList<List<Integer>>();
		
		//null case
		if(nums==null || nums.length==0) return result;
		
		//Find 3Sum triplets
		Arrays.sort(nums);		
		for(int i=0; i<nums.length-2; i++) {
			//check for outside duplicacy
			if(i!=00 && nums[i]==nums[i-1]) continue;
			
			//initialize two pointers
			int low=i+1;
			int high=nums.length-1;
			
			while(low<high) {
				int sum= nums[i]+nums[low]+nums[high];
				//3Sum triplet found, add to the result
				if(sum==0) {
					List<Integer> list= Arrays.asList(nums[i], nums[low], nums[high]);
					result.add(list);
					low++;
					high--;
					//Check for internal duplicacy
					while(low<high && nums[low]==nums[low-1]) low++;
					while(low<high && nums[high]==nums[high+1]) high--;
				}else if(sum<0) {
					low++;
				}else {
					high--;
				}
			}			
		}
		
		return result;
	}
	
	//Driver Code
	public static void main (String[] args) {
		ThreeSum ob= new ThreeSum();
		int[] nums= {-1,0,1,2,-1,-4};						
		System.out.println("3Sum triplets: "+ ob.findThreeSum(nums));		
	}
}
