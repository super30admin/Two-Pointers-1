// Time Complexity : O(n^2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
Sort the array and Iterate over the nums array and with each iterations, maintain left and right pointers.
Keep moving the left and right pointers till left > right.
If at any point if the sum of elements at i , left , right equals 0, add the elements to the Result List.
*/
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0){
            return new ArrayList<>();
        }
        //sort the array
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        //iterate over the nums arrays
        for(int i =0;i<nums.length-2;i++){
            if(i!=0 && nums[i-1]==nums[i]){
                continue;
            }
            //two pinters left and right for each i
            int left = i+1;
            int right = nums.length -1;
            
            //keeping i constant iterate with left and right pointers till left > right
            while(left < right){
                //check for the sum of elements at i, left, right at each point
                int sum = nums[i] + nums[left] + nums[right];
                //if the sum is 0, add to reesult
                if(sum==0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while(left<right && nums[left -1] == nums[left]){ //to avoid duplicate
                        left++;
                    }
                    right--;
                    while(left<right && nums[right]==nums[right+1]){//to avoid duplicate
                        right--;
                    }
                //if sum is less than 0, move the left pointer to a greater number so that the sum moves closer to 0
                }else if(sum<0){
                    left++;
                    while(left<right && nums[left] == nums[left-1]){//to avoid duplicate
                        left++;
                    }
                //if sum is greater than 0, move the right pointer to a lesser number so that the sum moves closer to 0    
                }else{
                    right--;
                    while(left<right && nums[right] == nums[right+1]){//to avoid duplicate
                        right--;
                    }
                    
                }
                
                
                
                
                
            }
            
        }
        
        return result;
        
    }
}