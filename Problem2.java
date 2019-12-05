// Time Complexity - O(n^2) where n is the number of elements in the array
//Space Complexity - O(1)
This solution worked on LeetCode

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null || nums.length<3){     // If the nums length is less than 3 it means triplets cannot be created.
            return result;
        }    
        Arrays.sort(nums);   // Sorting is important to avoid duplicates  
        for(int i=0; i<nums.length-2;i++){
            int low = i+1;              //low will start from next element to i index
            int high = nums.length-1;     // high will start at the end of the array
            if(i>0 && nums[i]==nums[i-1])  continue;  // Avoid duplicates with i pointer
            while(low<high){    
            int sum = nums[i] + nums[low] + nums[high];
                if(sum==0){
                    List<Integer> list = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(list);
                    low++;                  //increment the low since this element is added to the result
                    high--;                //decrement the high since this element is added to the result
                    while(low < high && nums[low] == nums[low-1])   low++;   // Avoid duplicates with low pointer
                    while(low <high && nums[high]==nums[high+1]) high--;    // Avoid duplicates with high pointer
                }
                else if(sum<0){        // If sum<0 it means the low is very low to make the sum<0. since we need sum=0. we will move to the next element
                    low++;
                }
                else{
                    high--;       // If sum >0 it means high is very high. To make the sum=0 , we will decrement the high to move to previous element.
                }

            }
        }
         return result;
    }      
}
