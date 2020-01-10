//(https://leetcode.com/problems/3sum/)

// Time Complexity : O(n logn+ n2) ==> Asymptotic time complexity ==> O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length <3) return new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if(nums[i] > 0 ) break;
            //Boundary condtion 1 : to avoid iterating over the same nums[i]
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int low = i+1;
            int high = nums.length-1;
            while(low<high){
                int sum = nums[i] + nums[low]+nums[high];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    //Boundary condtion 2 : to avoid iterating over the same nums[low]
                    while(low <high && nums[low] == nums[low-1] ){
                        low++;
                    }

                    //Boundary condtion 3 : to avoid iterating over the same nums[high]

                    while(low <high && nums[high] == nums[high+1]){
                        high--;
                    }
                }
                else if(sum < 0){
                    low ++;

                }
                else if(sum > 0){
                    high -- ;
                }
            }
        }
        return result;

    }
}