// Time Complexity : o(n*2)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode :  yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class TSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;
            if(i >  0 && nums[i]==nums[i-1]){
                continue;
            }
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left < right && (nums[left] == nums[left-1])){
                        left++;
                        while(left < right && (nums[right] ==  nums[right+1])){
                            right--;
                        }
                    }
                }else if(sum < 0){
                    left++;

                }else{
                    right--;
                }

            }
        }
        return result;
    }
}