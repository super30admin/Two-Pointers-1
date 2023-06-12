// Time Complexity : O(n^3)
// Space Complexity : O(n) [using Hashset to check for duplicates]
// Did this code successfully run on Leetcode : No(Time limit exceeded)
// Any problem you faced while coding this : yes


// Your code here along with comments explaining your approach
/* 1.Let try brute force by considering nested 3 for loops  and calculating the sum of three elemnents.
2. check if the sum matches the target. If it does sort the elements  and add to hashset.
3. Check if this combination exists in hashset.If it does dont add it.
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length ==0 ) return new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i =0;i< nums.length ;i++){ // or for  (int i =0;i< nums.length - 2;i++ )
               for (int j = i+1;j <nums.length;j++){ //or     for (int j = i+1;j <nums.length - 1;j++)
                    for (int k = j+1;k < nums.length ;k++){
                       int sum = nums[i] + nums[j] + nums[k];
                        if(sum==0){
                            List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                            Collections.sort(list);
                            if(!set.contains(list)){
                                result.add(list);
                                     set.add(list);
                            }
                       
                            
                        }
        }
        }
        
        }
   
        return result;
    }
}

// Time Complexity : O(n^2)
// Space Complexity : O(1) [As we do not use extra space]
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*1. we take a variable out and do the two sum approach with left and right pointer.
2. increment and decrement the left and right pointer accordingly when we encounter duplicates.
 * 
 */

 class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0 ) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i =0;i< nums.length ;i++){
            if(i>0 && nums[i]== nums[i-1]) continue; //if the numbers are same skip to next
            if(nums[i] > 0) break;//optimization : if there are elements greater than then you woudnt find elements which sum to 0 sine the array is sorted
        int left = i+1, right = n -1;
        while(left<right){
  int sum = nums[i] + nums[left] + nums[right];
  if(sum<0){
      left++;
  }
  else if(sum>0){
      right--;
  }
  else{
  
         result.add(Arrays.asList(nums[i],nums[left],nums[right]));
         left++;
         right--;
         //check and skip duplicates in leftpointer
         while(left < right && nums[left]== nums[left-1]){
             left++;
         }
         //check and skip duplicates in rightpointer
               while(left < right && nums[right]== nums[right+1]){
             right--;
         }

  }
        }
    }
    return result;
}
}