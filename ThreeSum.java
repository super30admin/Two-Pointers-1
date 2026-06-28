import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++){
            //outside duplicacy
            if (i >0 && nums[i] == nums[i-1]) continue;
            int left =i+1;
            int right = nums.length-1;

            while(left<right) {

                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> triple = Arrays.asList(nums[i],nums[left],nums[right]);
                    ans.add(triple);
                    left++;
                    right--;
                    while (left<right && nums[left] == nums[left-1]) left++;
                    while (left<right && nums[right] == nums[right+1]) right--;
                } else if (sum >0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return ans;
    }
}
