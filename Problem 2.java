// Time Complexity : nlogn for soring the array, and then n^2 for searching for sum so n^2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
The optimal method is to apply the 2 sum method with for each 1 element

We would sort the array , that would help us understand at which place would find the larger elements and at which we would find the smaller

We would pick one element , and take two pointer left and right , and move it based on the value of the sum to find 0;
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // we will pick one element and then solve the rest of the array using two pointers

        //we would sort the array first
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums); // nlog n


        for(int i=0;i<nums.length-2;i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;

        
           while(left<right){
            //if(nums[i]!=nums[left] && nums[left]!=nums[right] && nums[i]!=nums[right]){
                int current = nums[i] + nums[left] + nums[right];
                if(current == 0){
                    List<Integer> found = new ArrayList<Integer>();
                    found.add(nums[i]);
                    found.add(nums[left]);
                    found.add(nums[right]);
                    result.add(found);
                    
                    // move both left and right
                    left++;right--;
                }else if(current > 0){ // we need to lower right
                right--;
                }
                else{
                    left++;
                }
          //  }



            while(left >0 && left< nums.length && nums[left] == nums[left-1] && nums[left-1]!=nums[i]){
                left++; // move over the duplicate element
            }
            while(right < nums.length-1 && right >0 && nums[right] == nums[right+1]){
                right--; // move over duplicate element
            }

            }


        }

        return result;
        
    }
}