// Time Complexity : O(nlogn) + O(n2) = O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 3-sum problem
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        //sort the array
        Arrays.sort(nums); // O(nlogn)
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0; i<n-2; i++) { //o(n2)
            
            //skip computing 3-sum with repeated elements
            if(i!=0 && nums[i] == nums[i-1]) continue;

            //if it is a positive number, then should not check 2-sum in rest of the array
            // as we need 0 as the sum. so skip it
            if(nums[i]>0) break;

            //low pointer will start from just after the chosen 1st element
            // high pointer goes till end of array
            int low = i+1; int high = n-1;
            while(low<high) {
                int sum = nums[i] + nums[low] + nums[high];

                if(sum==0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                    //skip over repeated elements from low pointer
                    while(low<high && nums[low]==nums[low-1]) {
                        low++;
                    }

                    //skip over repeated elemnts from high pointer.
                    while(low<high && nums[high]==nums[high+1]) {
                        high--;
                    }
                }
                else if(sum<0){ //move low pointer
                    low++;
                }else{ //else move high pointer when sum>0
                    high--;
                }
            }

        }

        return result;
        
    }
}