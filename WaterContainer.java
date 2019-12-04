
public class WaterContainer {

	//	Time:  O(n^2) 
	//	Space O(1) 
	//	LeetCode: no. something is wrong. will try after class
	public int maxArea(int[] nums) {
		if(nums.length == 0 || nums == null) return 0;
		int max=0;        
		for(int i=0; i < nums.length; i++){
			for(int j = 1 ; j < nums.length;j++){

				int l = nums[i] - nums[j];
				int h = Math.min(nums[i], nums[j]);
				int area = l*h;
				max = Math.max(area, max);
			} 
		}
		return max;
	}
}
