import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOf3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        Arrays.sort(nums);
        for(int index = 0; index < length - 2; index++){
            if(nums[index] > 0){
               break;
            }
            if(index != 0 && nums[index] == nums[index -1]){
                continue;
            }
            int low = index + 1;
            int high = length -1;
            while(low < high){
                int sum = nums[index] + nums[low] + nums[high];
                if(sum < 0){
                    low++;
                }else if(sum > 0){
                    high--;
                }else{
                    result.add(Arrays.asList( nums[index], nums[low] , nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]){
                       low ++;
                    }
                    while(low < high &&nums[high] == nums[high+1]){
                      high--;
                    }
                }
            }
            
        }

        return result;
    }
    
}
