// Time Complexity : O(nlogn+n^2) ~= O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
//HashSet Approch
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length;i++){
              if (i == 0 || nums[i - 1] != nums[i]) {
            Set<Integer> twoSum = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int target = -nums[i] - nums[j];
                if(twoSum.contains(target)){
                    result.add(Arrays.asList(nums[i], nums[j], target));
                }
                 twoSum.add(nums[j]);
            }
        }
        }
          return new ArrayList(result);
    }
}

// Time Complexity : O(nlogn+n^2) ~= O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
//two Pointer Approch
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int low = i+1;
            int high = nums.length-1;
            while(low<high){
                int sum = nums[low]+nums[high]+nums[i];
                if(sum>0){
                    high--;
                }else if(sum<0){
                    low++;
                }else{
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while(low<high && nums[low] == nums[low+1]) low++;
                    while(low<high && nums[high] == nums[high-1]) high--;
                    low++;
                    high--;
                }
            }
        }
        return new ArrayList(result);
    }
}

