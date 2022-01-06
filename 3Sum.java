// Time Complexity : O(N*N)  
// Space Complexity : O(M) to store the triplets(LinkedList)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //first sort the array
        Arrays.sort(nums);
        
        //create  a L.L to store all unique triplets
        List<List<Integer>> result = new LinkedList<> ();
        
        //for loop to move our 'a'( a + b = -a) from 0th index till 2nd last index bcz only one elemetn will be left in the end and not 2 elements
        
        for(int i= 0; i<nums.length - 2; i++){
            
            //condition to make sure duplicates are avoided
            
            if(i== 0 || (i> 0 && nums[i] != nums[i-1])){
                
                int low = i+ 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i]; //a = -(b+c)
                
                //2 pointer approach -- runs till low pointer doesnt cross or high pointer
                
                while(low<high){
                    
                    if(nums[low] + nums[high] == sum){
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        
                        while(low<high && nums[low] == nums[low + 1]) low++;
                        while(low<high && nums[high] == nums[high - 1]) high --;
                        
                        low ++;
                        high --;
                    } else if(nums[low] + nums[high] < sum) low ++;
                    else high --;
                 
                }
            }
        }
        
        return result;
    }

}