/*
Time: O(Nlog(N))
Space: O(1)
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ThreeSum {
    public  List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
           int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if ( sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(res);

    }
   
    public static void main(String[] args) {
        ThreeSum object = new ThreeSum();
        int[] nums = new int[]{4,5,3,1,8,0,6,7,2};
        List<List<Integer>> res = object.threeSum(nums);
    }
}
