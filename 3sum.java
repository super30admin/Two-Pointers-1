//time N^2logN 
//space O(1)
//approach: Two pointers

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        if(nums.length == 3){
            if(nums[0]+nums[1]+nums[2] == 0) {
                result.add(Arrays.asList(nums[0], nums[1], nums[2]));
            }
            return result;
        }
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0; i < n-2; i++) {
            if(nums[i] > 0) break;
            if(i != 0 && nums[i-1] == nums[i]) continue;
            int left = i + 1; int right = n -1;
            while(left < right) {
                int currSum = nums[i] + nums[left] + nums[right];
                if(currSum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++; right--;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right+1] == nums[right]){
                        right--;
                    }
                } else if(currSum < 0) {
                    left++;
                } else if(currSum > 0) {
                    right--;
                }
            }
        }
        return result;
    }
}
