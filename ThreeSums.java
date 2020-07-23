/* Time Complexity: O(n*n)
space Complexity: O(1)

1. Using the pointers, low and high to find triplets whose sum is 0. 
2. Iterating through the array, for each element at ith position, placing low at (i+1)th position and high at the last position, 
incrementing low if sum < 0 and decrementing high when sum > 0.
3. When sum equals zero, increment low and decrement high.

*/

class Solution{
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        //edge case
        if(nums.length < 3){
            return result;
        }

        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n-2; i++){
            if((i>0) && (nums[i-1] == nums[i])){
                continue;
            }

            int low = i+1;
            int high = n-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];

                if(sum == 0){
                    List<Integer> current = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(current);
                    low++; high--;
                    while(low<high && nums[low] == nums[low-1]){
                        low++;                        
                    }
                    while(low<high && nums[high] == nums[high+1]){
                        low--;                        
                    }
                }

                else if(sum < 0){
                    low++;
                }

                else{
                    high--;
                }
            }
        }

        return result;
    }
}

