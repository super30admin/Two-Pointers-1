/* 
Algorithm:
     1. Sort the array. Traverse through the array till length-2.
     2. For each element, check for combination of it with two more elements such that sum is equal to 0.
     3. To handle duplicates, initially if we have 2 elements which are same then we move forward. For each element when we are checking for 2 more elements inside, if the nums[low]==nums[low-1] move to next element i.e right. If the nums[high]==nums[high+1] then decrease high pointer
     
     
     Time Complexity: O(n^2)
     Space Complexity: O(1);
     Did the code run successfully on leetcode? Yes
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //Base case
        if(nums.length==0 || nums==null)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length -2 ;i++){
            
            if(i>0 && nums[i-1]==nums[i])
                continue;
            
            if(nums[i]>0){ //more optimization as we have sorted the array we know that if we reach an element which is greater than 0 then we will not have any combination which is equal to 0
                break;
            }
           int low = i+1;
           int high = nums.length-1;
            
            while(low<high){
                
               
            
            int sum = nums[i]+nums[low]+nums[high];
            //Case 1: sum=0
                
            if(sum==0){
               
                List<Integer> newList = Arrays.asList(nums[i], nums[low], nums[high]);
                result.add(newList);
                low++;
                high--;
                //We should not add duplicates
                while(low<high && nums[low-1]==nums[low])low++;
                while(low<high && nums[high]==nums[high+1])high--;  
                
            }else if(sum<0){ //Case 2: sum<0
                low++;
            }else{ // Case 3: sum>0
                high--;
            }
            
        }
            
        }
        
        return result;
        
    }
}