import java.util.*;

//	Time:  O(n^2.logn) 
//	Space O(n) extra list 
//	LeetCode: TLE
public class threeSumTLE {
	public List<List<Integer>> threeSum(int[] nums) {
	
	List<List<Integer>> result = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    Arrays.sort(nums);
    
    for(int i =0 ; i < nums.length; i++){
        int target = 0- nums[i];
        
        int l = 1;
        int r = nums.length -1;
        while(l < r){
        if(nums[l] + nums[r] == target) {
            result.add(Arrays.asList(nums[i], nums[r], nums[l]));
            while(l < r) if(nums[i] == nums[i-1]) 
            l++;
            r--;
        }else if(nums[l] + nums[r] > target) {
            r--;
        }else if(nums[l] + nums[r] <target){
            l++;
        }
        result.add(ans);
    }
    }
    return result;
	}

}
