import java.util.*;
//	Time:  O(n^2) 
//	Space O(n) extra set 
//	LeetCode: yes
public class threeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> res  = new HashSet<>();
		if(nums.length==0) return (List<List<Integer>>) res;
		Arrays.sort(nums);
		for(int i=0; i<nums.length-2;i++){
			int j =i+1;	
			int  k = nums.length-1;
			while(j<k){
				int sum = nums[i]+nums[j]+nums[k];
				if(sum==0){res.add(Arrays.asList(nums[i],nums[j],nums[k]));
				j++;
				k--;}
				else if ( sum >0) k--;
				else if (sum<0) j++;
			}

		}
		return new ArrayList<>(res);
	}
}
