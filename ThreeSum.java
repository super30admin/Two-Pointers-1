//Time Complexity: O(n^2)
//Space Complexity: O(1)


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println("List of three sum target to 0: "+list);

    }
    private static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // null Case
        if(nums == null || nums.length == 0){
            return result;
        }

        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i]>0){
                break;
            }
            int left =i+1;
            int right =n-1;
            while(left<right){
                int curr = nums[i]+nums[left]+nums[right];
                if(curr == 0){
                    List<Integer> li =Arrays.asList(nums[i],nums[left],nums[right]);
                    result.add(li);
                    left++;
                    right--;

                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }

                }else if(curr < 0){

                    left++;

                }else{
                    right--;
                }

            }
        }
        return result;
    }
}
