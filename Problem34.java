//Time Complexity: O(n^2)
//Space Complexity: O(1)
//Did it run on leetcode: yes
//Problems faced any: No

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem34 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0)
            return new ArrayList<>();

        //Sort the given array this is to reduce our problem to two pointer approach
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int low = i+1;
            int high = nums.length-1;

            while(low<high){
                //calculate sum of given indices
                int sum = nums[i]+nums[low]+nums[high];
                //since array is sorted if sum<0 we need to move our low towards right
                if(sum<0){
                    int v = nums[low];
                    while(low<high && nums[low]==v){
                        low++;
                    }
                }else if(sum>0){
                    //sum>0 mean to come closer to zero move our high towards left
                    int v = nums[high];
                    while(low<high && nums[high]==v){
                        high--;
                    }
                }else{
                    //we found a triplet will add the numbers to our list
                    list.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    int v = nums[low];
                    while(low<high && nums[low]==v){
                        low++;
                    }
                    v = nums[high];
                    while(low<high && nums[high]==v){
                        high--;
                    }
                }
            }

        }

        return list;
    }
}
