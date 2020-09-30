class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      

        // Time : O(n^2)
        //Space: O(n)
        // here we are taking 2 pointers as lo and hi . Taking i as third pointer and continously checking if lo +hi +i ==0 and is if its != 0 then decreasing hi and increasing lo and at the same time checking if there are no duplicates in list.
        List<List <Integer>> result = new ArrayList<List<Integer>>();
       Arrays.sort(nums);
        
         for(int i =0 ; i < nums.length-1 ; i++){
            
            if(i ==0 || ( i > 0 && nums[i] != nums[i-1]))
            {
                int low = i+1; 
                int high = nums.length-1;
                int sum = 0 - nums[i];
                while(low< high){
                   if(sum == nums[low] + nums[high]){
                        result.add(Arrays.asList(nums[low], nums[high] , nums[i]));
                       
                      while(low < high && nums[low] == nums[low+1]) low++;
                      while(low < high && nums[high] == nums[high-1]) high--;
                        
                    low++;
                    high--;
                    }
                    else if(nums[low] + nums[high] > sum){
                        high--;
                    }
                    else {
                        low++;
                    }
                         
                }
            }
                
            }
        
  

    return result;
    }
}