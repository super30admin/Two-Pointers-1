

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		int y, z;
		List<List<Integer>> output = new ArrayList<>();
        if (nums.length < 3) {
            return output;
        }
		Arrays.sort(nums); // -4  -1  -1 , 0, 1 , 2
		for (int x = 0; x < nums.length - 1; x++) {
			y = x + 1;
			z = nums.length - 1;
			if (x > 0 && nums[x] == nums[x - 1])
				continue;
			while (y < z) {
				int sum = nums[x] + nums[y] + nums[z];
				if (sum == 0) {
					Integer[] out = { nums[x], nums[y], nums[z] };
					output.add(Arrays.asList(out));
					while (y < z && nums[y] == nums[y + 1]) {
						y++;
					}
                    while (y < z && nums[z] == nums[z - 1]) {
						z--;
					}
                    y++;
                   // z--;
				} else if (sum > 0) 
					z--;
				  else 
					y++;	
			}
		}
		return output;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 0, 0, 0 };
		List<List<Integer>> output = threeSum(nums);
		for (List l : output) {
			System.out.println(l);
		}
		
	}

}
