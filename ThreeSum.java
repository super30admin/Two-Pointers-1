import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayßList<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        for(int curr =0; curr<nums.length-2;curr++){
            if(curr>0 && nums[curr] == nums[curr-1]){
                continue;
            }
            int low = curr+1;
            int high = nums.length-1;

            while(low<high){
                int sum = nums[curr] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[curr]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    result.add(temp);
                    low++;
                    high--;

                    while(low<high && nums[low] == nums[low-1]){low++;}
                    while(low<high && nums[high] == nums[high+1]){high--;}
                }else if(sum<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return result;
    }
}
