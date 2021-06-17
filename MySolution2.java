import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        //Start with sorting
        Arrays.sort(nums);
        int[] sortedArr = nums ;


        //Initial Loop
        for(int i = 0; i<nums.length && nums[i]<= 0; i++){
            if (i == 0 || nums[i - 1] != nums[i]) {
                int currentNum = nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                List<Integer> tempRes =  new ArrayList<Integer>();
                while(left<right){
                    int sum = currentNum + nums[left] + nums[right] ;
                    if(sum <0){
                        left++;
                    }
                    else if(currentNum + nums[left] + nums[right] > 0){
                        right--;
                    }
                    else{

                        tempRes.add(currentNum);
                        tempRes.add(nums[left]);
                        tempRes.add(nums[right]);
                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                    }

                }
                result.add(tempRes);
            }

        }
        return result;
    }
}