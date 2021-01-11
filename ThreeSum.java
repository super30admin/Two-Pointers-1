// time complexity : O(nlogn)
// space complexity : O(n)
package ThirdWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        if(nums==null || nums.length ==0)return result;

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            int low = i+1;
            int high = nums.length-1;

            while(low<high){
                int sum = nums[low]+nums[high]+nums[i];

                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[low],nums[high],nums[i]);
                    result.add(li);
                    low++;high--;
                    while (low<high && nums[low]==nums[low-1]) low++;
                    while (low<high && nums[high]==nums[high+1]) high--;

                } else if(sum > 0){
                    high--;
                } else{
                    low++;
                }

            }
        }


        return result;
    }


    public static void main(String args[]) {
        int arr[] = {-1,0,1,2,-1,-4};
        //int arr_size = arr.length-1;
        threeSum(arr);


    }

}
