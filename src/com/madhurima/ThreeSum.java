/*
    Time Complexity = nLogn + n2 = O(n2)
    Space Complexity = O(1)
    Did this code successfully run on Leetcode : yes
 */


package com.madhurima;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
}

class SolutionB {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3){
            return new ArrayList<List<Integer>>();
        }

        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums); //logn

        for(int i = 0; i < n; i++){

            // no sense in continuing with positive set of numbers
            if(nums[i] > 0){
                break;
            }

            // to project outer loop from duplicates
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int low = i+1;
            int high = n-1;

            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    //protect inner loop from duplicates
                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]){
                        high--;
                    }
                }else if(sum < 0){
                    low++;
                }else{
                    high--;
                }
            }

        }

        return list;
    }

    public static void main(String[] args) {
        SolutionB s = new SolutionB();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(s.threeSum(nums).toString());
    }
}
