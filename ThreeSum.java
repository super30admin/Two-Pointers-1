import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Leetcode - 15
//Time Complexity - NlogN+O(N^2) = O(N^2)
//Space Complexity - O(1)
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // nlogn
        for(int i=0;i<nums.length-2;i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            //2 sum with 2 pointer solution
            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(li);
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]) left++;
                    while(left<right && nums[right] == nums[right+1]) right--;
                } else if(sum>0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;

    }
}
