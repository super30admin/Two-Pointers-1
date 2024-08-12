// Time Complexity : O(nlogn)(sorting) + O(n2) = O(n2logn)
// Space Complexity : O(1) I used output array.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I used the same logic Jaspinder explained. 

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // int outrP = 0;
        // int l=0,r=nums.length - 1;
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0;i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;

            int low = i + 1;
            int high = nums.length - 1;
            
            while(low < high){
                int total = nums[i] + nums[low] + nums[high];
                if(total == 0){
                    List<Integer> triplet = Arrays.asList(nums[i],nums[high],nums[low]);
                    list.add(triplet);
                    low++;
                    high--;

                    //inner duplicacy
                    while(low< high && nums[low] == nums[low -1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high + 1]){
                        high--;
                    }
                }else if(total < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return list;
    }
}
