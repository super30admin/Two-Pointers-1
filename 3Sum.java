// Time Complexity : O(n2)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> aList = new ArrayList<>();
       for(int i=0; i < nums.length; i++) {
         int left = i+1, right= nums.length -1;
         if(nums[i] > 0) break;
         if(i!=0 && nums[i] == nums[i-1]) continue;
         while(left < right) {
            int sum = nums[i]+ nums[left] + nums[right];
            if(sum == 0) {
                aList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                 while(left < right && nums[left] == nums[left-1]) left++;
                while(left < right && nums[right] == nums[right+1]) right--;
            } else if(sum >0) {
                right--;
            } else {
                left++;
            }
         }
       }
       return aList;
    }
}