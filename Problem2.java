//time o(nlogn + n^2)
//space o(log n) to o(n) required for sorting

class Solution {
     List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int target = nums[i] * -1;
            findTriplet(nums, i+1, nums.length-1, target);
        }
        return res;
    }
    
    void findTriplet(int[] nums, int j, int k, int target) {
        while(j<k) {
            int sum = nums[j]+nums[k];
            if(sum == target) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(target*-1);
                temp.add(nums[j]);
                temp.add(nums[k]);
                res.add(temp);
                j++;
                k--;
                while (j < k && nums[j] == nums[j - 1]) j++;  
                while (j < k && nums[k] == nums[k + 1]) k--;  
            } else if(sum < target) {
                j++;
            } else {
                k--;
            }
        }
    }
}
