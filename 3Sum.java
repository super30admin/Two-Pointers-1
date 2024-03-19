// Time Complexity : O(n^2) where 'n' is the length of nums.
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Approach:
//First, sort the input array in increasing order.
//Iterate through the array with a pointer "i" from 0 to n-2, where n is the size of the array.
//For each "i", initialize two pointers "lo" and "hi", where "lo" starts at i+1 and "hi" starts at n-1.
//Calculate the sum of elements at i, lo, and hi. If the sum is equal to zero, add the triplet to the result vector.
//If the sum is less than zero, increment "lo" to move towards higher values. If the sum is greater than zero, decrement "hi" to move towards lower values.
//To avoid duplicates, if a value has already been considered, skip it in the future iterations.
//Continue the above process until all possible triplets are considered

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n-2 ; i++){
            int low = i+1;
            int high = n-1;
            if(i!=0 && nums[i] == nums[i-1]){
                    continue;
                }
            while(low<high){
                int curr = nums[i] + nums[low] + nums[high];
                if(curr == 0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                while(low<high && nums[low] == nums[low -1]){
                    low++;
                }
                while(low<high && nums[high] == nums[high -1]){
                    high--;
                }
                }else if(curr < 0){
                    low++;
                }else{
                    high--;
                }
            }   
        }
    return result;
    }
}