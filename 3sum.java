// Time Complexity : O(n^2) where n is the length of the array
// Space Complexity : O(n) (set of list)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        Set<List<Integer>> set = new HashSet<>(); // we use a set so that duplicates entries aren't found
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(list); // perform sorting because {-1,0,1} and {0,1,-1} are different but are duplicates so sort them and add into the set
                        if(set.contains(list) == false) { // set is used to ensure duplicates aren't entered
                            set.add(list);
                            result.add(list);
                        }
                    }
                }
            }
        }
        return result;
    }
}

// Time Complexity : O(n^2) where n is the length of the array
// Space Complexity : O(n) or O(logn) based on the space complexity of sorting
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        // sort the array to apply two pointer technique
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                // avoid duplicates
                continue;
            }
            int low = i + 1, high = nums.length - 1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    // if sum is zero increment low and decrement high
                    List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(list);
                    low++;
                    // high--;
                    while(low < high && nums[low] == nums[low - 1]) {
                        // avoid duplicates
                        low++;
                    }
                    while(low < high && high + 1 < nums.length && nums[high] == nums[high + 1]) {
                        // avoid duplicates
                        high--;
                    }
                }
                else if(sum > 0) {
                    // decrement high to reduce the sum
                    high--;
                }
                else {
                    // incremeent the low to increase the sum
                    low++;
                }
            }
        }
        return result;
    }
}
