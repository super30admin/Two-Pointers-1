/* Time Complexity : O(n^3)
 * 	n - length of the input array - height */
/* Space Complexity : O(k)
 * k - size of the hashset */

//Brute Force

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> unique = new HashSet<>();
        if(nums == null || nums.length == 0) return result;
        int target = 0;
        int n = nums.length;
        
        for(int i = 0; i < n-2; i++){
            for(int j = i + 1; j < n-1; j++){
                for(int k = i + 2; k < n; k++){
                    if(i != j && j != k && k != i){
                        int currSum = nums[i]+nums[j]+nums[k];
                        if(currSum == target){
                            int[] temp = new int[]{nums[i], nums[j], nums[k]};
                            Arrays.sort(temp);
                            
                            
                            List<Integer> li = Arrays.asList(temp[0], temp[1], temp[2]);
                            if(unique.contains(li) == false){
                                System.out.println(temp[0] + " " + temp[1] + " " + temp[2]);
                                result.add(li);
                                unique.add(li);
                            }
                        }
                    }
                }
            }
        }


        
        return result;
    }
}

