class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {

        //Optimal approach:
        // Time Complexity : O(n^2)
        // Space Complexity : o(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : I felt difficult to come up with optimal approach 

        List <List<Integer>> result = new ArrayList<>();
        //Sorting the array 
        Arrays.sort(nums);
        for ( i = 0;i<nums.length;i++){

         //Skipping duplicate values
         if(i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length -1;

            //Applying two pointer technique
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    //skipping duplicates before increasing the counter 
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right -1]) right --;
                    
                    left++;
                    right--;
                }
                    else if (sum < 0){
                        left++;
                    }
                    else{
                        right --;
                    }
            }   
           
        }
         return result;
    }
}