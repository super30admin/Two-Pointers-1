//TC = O(nlogn) + O(n^2) = O(n^2)
//SC = O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            int low = i+1;
            int high = n-1;
            int target = 0-nums[i];
            if(i!=0 && nums[i]==nums[i-1]) continue;
            while(low<high){
                if(nums[low]+nums[high]==target){
                    List<Integer> twosum = new ArrayList<>();
                    twosum.add(nums[i]);
                    twosum.add(nums[low]);
                    twosum.add(nums[high]);
                    res.add(twosum);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else if(nums[low]+nums[high]<target){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        List<List<Integer>> ans = ThreeSum.threeSum(new int[]{-1,0,1,2,-1,-4});
        for (List<Integer> each:ans) {
            System.out.println(each);
        }
    }
}
