// Time Complexity - O(n^3) for brute force approach and O(n^2) for 2 pointer approach
// Space Complexity - O(1) for both approach

import java.util.*;

public class ThreeSum {

    // brute force approach
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            // null check
            if(nums.length == 0 || nums == null) return new ArrayList<>();

            HashSet<List<Integer>> set = new HashSet<>();
            int n = nums.length;

            for (int i=0; i<n-2;i++){
                for(int j=i+1; j<n-1;j++){
                    for(int k=j+1; k<n; k++){
                        if (nums[i] + nums[j] + nums[k] == 0){
                            List<Integer> li = Arrays.asList(nums[i],nums[j],nums[k]);
                            Collections.sort(li);
                            set.add(li);
                        }
                    }
                }
            }
            return new ArrayList<>(set);
        }
    }

    // 2 Pointer appoach
    static class Solution2 {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            // null
            if(nums==null || nums.length == 0) return result;
            int n = nums.length;
            Arrays.sort(nums);

            for (int i=0; i<n-2;i++) {
                if(nums[i] > 0 ) break;
                // Outside Duplicacy
                if(i!=0 && nums[i]==nums[i-1]) continue;
                int low = i+1;
                int high = n-1;
                while(low<high) {
                    int sum = nums[i] + nums[low] + nums[high];
                    if (sum==0) {
                        List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                        result.add(li);
                        low++;
                        high--;
                        //inside duplicacy
                        while(low<high && nums[low] == nums[low-1] ) low++;
                        while(low<high && nums[high] == nums[high+1]) high--;
                    }
                    else if(sum>0){
                        high--;
                    }
                    else{
                        low++;
                    }
                }
            }
            return result;
        }
    }
}
