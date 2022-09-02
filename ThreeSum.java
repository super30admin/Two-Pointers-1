// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        //null check
        if (nums == null || nums.length == 0)
            return result;

        int n = nums.length;

        //sort the given nums array
        Arrays.sort(nums);

        // take 2 pointers - low and high
        for (int i = 0; i < n - 2; i++) {

            if (nums[i] > 0)
                break;

            //outside duplicacy
            if (i != 0 && (nums[i] == nums[i - 1]))
                continue;

            int low = i + 1;
            int high = n - 1;

            while (low < high) {

                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++;
                    high--;

                    //inside duplicacy
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }

                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                } else if (sum > 0)
                    high--;
                else
                    low++;
            }
        }
        return result;

    }
}

/* Using Hashing technique TC: O(n^2), SC: O(n)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //null check
        if(nums == null || nums.length == 0)
            return new ArrayList<>();

        HashSet<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        for(int i = 0 ; i< n-2 ; i++){
            for(int j = i+1 ; j < n-1 ; j++){
                for(int k = j+1 ; k < n ; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(li);
                        set.add(li);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}

*/
}
