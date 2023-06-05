import java.util.*;

public class ThreeSum {
    //time complexity" for sorting its n(log n) // not sure of the other part
    // space complexity: constant
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this : no
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();// used a set to avoid duplicate combinations

        Arrays.sort(nums);

        for(int i =0; i<nums.length-2;i++){
            int third= nums[i];
            int l=i+1;
            int r= nums.length-1;
            while(l<r){
                int twoSum= nums[l]+nums[r];
                if(twoSum==-(third))
                    ans.add(Arrays.asList(third,nums[l++],nums[r--]));

                else if(twoSum<-third)
                    l++;
                else
                    r--;
            }
        }

        return new ArrayList<>(ans);

    }
}
