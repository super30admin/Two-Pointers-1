class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Time Complexity: O(n^2) where n is number of elements in nums array
        // Space Complexity: O(1) where space is constant
                // If nums array is null or the length of array is less than 3 then return empty list.
       if(nums.length<3 || nums==null)
       {
           return new ArrayList<>();
       } 
       List<List<Integer>> result = new ArrayList<>();
       // length of ani nums array
       int n = nums.length;
       // Sorting the aray // Time Complexity: n*log(n)
       Arrays.sort(nums);
       for(int i=0;i<=n-3;i++)
       {
            int left = i+1; // Starting point for starting 2Sum
            int right = n-1; //Ending point for starting 2Sum
            while(left<right) 
            {
               int sum = nums[i]+nums[left]+nums[right]; // sum of fixed value and 2 sum values
               if(sum == 0) // if sum is 0 which is the required case
               {
                   List<Integer> temp = Arrays.asList(nums[i],nums[left],nums[right]);
                   result.add(temp);// add it to the result array
                   // as the elements at left and right index and the main value from outer loop have sum 0 we move both left and right value
                   left++; 
                   right--;
                   while((left < right) && (nums[right]==nums[right+1]))
                   {
                       // if the right value after decrement is same as the last right value then we do not need to redo the calculation as it would give duplicate values so we decrement right until we find different value
                       right--; 
                   }
                   while((left<right) && (nums[left]==nums[left-1]))
                   {
                       // if the left value after increment is same as the last left value then we do not need to redo the calculation as it would give duplicate values so we increment left until we find different value
                       left++;
                   }
               }
               else if(sum>0) // if sum is greater than 0 then decrement right value as we need to reduce the value to reach 0 and as the array is sorted so we decrement the right value.
               {
                   right--;
                   while((left<right) && (nums[right]==nums[right+1]))
                   {
                       right--;
                   }
               }
               else  // if sum is less than 0 then increment left value as we need to increase the value to reach 0 and as the array is sorted so we increment the left value. 
               {
                   left++;
                   while((left<right) && (nums[left]==nums[left-1]))
                   {
                       left++;
                   }
               }
            }
            // if the current element is same as the next element from outer loop then we can skip it to avoid duplicates
            while(i<=n-3 && nums[i]==nums[i+1])
            {
                i++;
            }
       }

        // return result
        return result;

    }
}
