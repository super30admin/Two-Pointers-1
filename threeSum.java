//Time complexity - O(n)
// Space complexity - O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //using brute force approach
        List<List<Integer>> result = new ArrayList<>();
      //  HashSet<List<Integer>> set = new HashSet<>();
        if(nums.length < 3 || nums == null){return result;}
        
  //   int pivot = 0;
  //   int left = pivot + 1;
  //   int right = nums.length - 1;
        Arrays.sort(nums);
        
   //  while(left < right){
         
      //   if(nums[pivot] != nums[pivot-1]){
       for(int pivot = 0; pivot < nums.length - 2; pivot ++){
           //handling outside duplicacy of pivot element and pivot - 1 element
           if(pivot != 0 && nums[pivot-1] == nums[pivot]){continue;}
           int left = pivot + 1;
           int right = nums.length - 1;
           while(left < right){
             
             if(nums[pivot] + nums[left] + nums[right] == 0){
                 
                 //result
                 List<Integer> li = Arrays.asList(nums[pivot] , nums[left] , nums[right]);
                 result.add(li);
                 
                 left ++;
                 right --;
                 while(left < right && nums[left] == nums[left-1] ){
                     
                     left++;
                     
                 }
                  while(left < right && nums[right] == nums[right+1] ){
                     
                     right --;
                     
                 }
             }
             else if( nums[pivot] + nums[left] + nums[right] < 0){
                 
                 left ++;
             }
             
             else if( nums[pivot] + nums[left] + nums[right] > 0){
                 
                 right --;
             }
             
            }
                
               // pivot ++;
            
    
       }
        
        return result;
    }
}