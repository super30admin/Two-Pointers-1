// Time Complexity : O(n logn) + O(n^2) = O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english  : Built on top of 2SUM, fix outer number and then find other two numbers using two pointer approach over rest of the array

// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            //to avoid outer duplicacy
            if( i != 0 && nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] > 0){
                break;
            }

            int low = i+1;
            int hi = n-1;
            while( low < hi){
                int sum = nums[i] + nums[low] + nums[hi];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[hi]));
                    low++;
                    hi--;
                    //to avoid internal duplicacy
                    while( low < hi && nums[low] == nums[low-1]){
                        low++;
                    }

                    while( low < hi && nums[hi] == nums[hi+1]){
                        hi--;
                    }
                }else if( sum < 0){
                    low++;
                }
                else{
                    hi--;
                }
            }
        }

        return result;
    }
}