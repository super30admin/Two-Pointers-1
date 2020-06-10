/**
 * Time Complexity: O(n^3*klogk) where n = size of nums array, k = size of list ,i.e. 3
 * Space Complexity : O(n)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBruteForce {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length<3) return new ArrayList<>();
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        result.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String args[]){
        ThreeSumBruteForce obj = new ThreeSumBruteForce();
        int[] myArr = new int[]{-1,0,1,2,-1,-4};
        System.out.println(obj.threeSum(myArr));
    }
}