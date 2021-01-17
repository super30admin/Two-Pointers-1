

/*

Brute force try every pair -> run time : O(N^3);
Or Can do 2 pointer solution after sorting nums
O(N^2) solution with two pointers without hashing. 
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue; //outside duplicates
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                int sum = nums[low] + nums[high]+nums[i];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[low],nums[high],nums[i]);
                    result.add(li);
                    low++;
                    high--;
                    //Duplicates in the inner loop.
                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]){
                        high--;
                    }
                }else if(sum > 0){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return result;
    }
}




/*

Brute force try every pair -> run time : O(N^3);
Or Can do 2 pointer solution after sorting nums
O(N^2) solution with two pointers without hashing. 
*/


