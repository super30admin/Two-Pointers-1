/**
 * Using Two Pointers
 * Time Complexity = O(n^2) + O(nlogn)
 * Space Complexity = O(1)
 */

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length -1;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0; i<n; i++){
            int target = -nums[i];
            int low = i+1;
            int high = n;
            while(low < high){
                if(nums[low] + nums[high] == target){
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                }
                else if(nums[low] + nums[high] > target){
                    high--;
                }
                else {
                    low++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}

/**
 * HashSet
 *  * Time Complexity = O(n^3)
 * Space Complexity = O(n)
 */

 class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> mySet = new HashSet<>();

        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1])
                continue;

            int target = -nums[i];
            Set<Integer> seen = new HashSet<>();

            for(int j=i+1; j<nums.length; j++){
                int compliment = target - nums[j];
                if(seen.contains(compliment)){
                    mySet.add(Arrays.asList(nums[i], nums[j], compliment));
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(mySet);
    }
}