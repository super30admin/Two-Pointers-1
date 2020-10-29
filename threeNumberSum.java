//Time complexity: O(n*n)
//Space Compexity: O(1)
//Program ran successfully
/*
    Algorithm: 1. First, we sort the array
               2. Then we traverse the array using three pointers.
               3. First pointer is the slow pointer that traverses the array element by element. 
               4. Second pointer is the low pointer that is 1+slow pointer and third is the high pointer which is at last index of array
               5. If sum of elements at all 3 poiners is 0, we add it to a list.
               6. If sum > 0 we decrement the high pointer
               7. If sum < 0 we increment the low pointer.
               8. Duplicate elements are taken care of by skipping those elements
    
*/

class threeNumberSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        //edge cases
        if(nums == null || nums.length == 0) return answer;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = nums.length - 1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    answer.add(li);
                    high--;
                    low++;
                    while(low < high && nums[high] == nums[high+1]){
                        high--; 
                    }
                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    }
                    
                }else if(sum > 0){
                    high--;
                }else{
                    low++;
                }
                
            }
        }
        return answer;
    }
}
