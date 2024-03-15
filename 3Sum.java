import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /* Time Complexity: O(n^2);
    Space Complexity : O(n);

    Executed in leetcode;
    */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i<=n-3;i++){
            if (nums[i] > 0) break;
            int l = i+1;
            int h = n-1;
            if (i!= 0 && nums[i] == nums[i-1]){
                continue;
            }
            while (l< h){
                int currSum = nums[i] + nums[l] + nums[h];
                if(currSum == 0){
                    result.add(Arrays.asList(nums[i], nums[l],nums[h]));
                    l++;
                    h--;
                    while(l < h && nums[l] == nums[l-1]){
                        l++;
                    }
                    while (l< h && nums[h] == nums[h+1]){
                        h--;
                    }
                }else if (currSum < 0){
                    l++;
                }else{
                    h--;
                }
            }
        }
        return result;

        
    }
}
