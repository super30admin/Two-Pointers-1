import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class threeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0 ) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i -1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);

                    res.add(li);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        threeSum ts = new threeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(ts.threeSum(nums));
    }
}