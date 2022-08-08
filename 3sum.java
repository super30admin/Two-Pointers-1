// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

// here, we're applying two pointers method

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length==0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        int n= nums.length;
        Arrays.sort(nums);

        //first we fix the first element with the for loop
        for(int i=0; i<n-2; i++){
            if(nums[i]>0)break;

            // handles outside dulplicacy
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int low=i+1;
            int high=n-1;
            if(nums[high]<0)break;

            // and, we try to find target 0, by moving low and high pointers
            while(low<high){
                if(nums[i]+nums[low]+nums[high] == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    low++;
                    high--;

                    //handles inside dulplicacy
                    while( low<high && nums[low] == nums[low-1]) low ++;
                    while( low<high && nums[low] == nums[high+1])high--;

                } else if(nums[i]+nums[low]+nums[high]<0){
                    low ++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }
}