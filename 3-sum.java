// Time Complexity : 0(n^2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> list = new ArrayList<List<Integer>>();
       int n = nums.length;
       Arrays.sort(nums);
       for(int i = 0 ; i <n-2; i++){
        //external checkpoint
        //checking if the current value is greater than 0 then we break the loop because the array is sorted and the next values are going to be greater than 0 means the sum is going to be greater than 0
           if(nums[i]>0){
               break;
           }
              //checking if the current value is equal to the previous value then we continue the loop because we have already found the pairs for the previous value
           if(i > 0 && nums[i] == nums[i-1]) continue;
           int fix = nums[i];
           int left = i+1;
           int right = n-1;
           //using two pointer approach to find the pairs
           while(left < right){
               List<Integer> list2 = new ArrayList<Integer>();
               int Sum = fix+nums[left]+nums[right];
               if(Sum == 0){
                   list2.add(fix);
                   list2.add(nums[left]);
                   list2.add(nums[right]);
                   list.add(list2);
                   left++;right--;
                   //internal checkpoint
                     //checking if the next value is equal to the previous value then we continue the loop because we have already found the pairs for the previous value
                   while(left<right && nums[left] == nums[left-1]){
                       left++;
                   }
                   while(left<right && nums[right] == nums[right+1]){
                       right--;
                   }
                   //if the sum is greater than 0 then we decrement the right pointer
               }else if(Sum > 0){
                   right--;
               }//if the sum is less than 0 then we increment the left pointer
               else{
                   left++;
               }
           }
       }
       return list;
    }
}
