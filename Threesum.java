//Time Complexity: O(n3) 
//Space complexity: O(1)

//Problems faced on leetcode: Time limit exceeded for long input array

import java.util.*;

public class Threesum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> b = new ArrayList< List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                for(int k=1+j;k<nums.length;k++) {
                    if(nums[i]+nums[j]+nums[k] == 0 && !b.contains(Arrays.asList(nums[i], nums[j], nums[k]))){
                       b.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] nums = {1,-2,-4,23,4,5,-3,2,1,2,3,4,5,45};
        System.out.println(threeSum(nums));

    }
}