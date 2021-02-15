//T= O(n log n ) : sort + n * n (for & while)  => O(n^2)
//S = O(n) or O(log n)for sort space

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        //check for invalid input
        if(nums == null || nums.length < 3){
            return result;
        }
        
        //declare two pointers
        int left = 0;
        int right = 0;
        
        //sort the array
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            //skip if number is same as we do not want duplicates 
            if(i > 0 &&  nums[i] == nums[i-1])
                continue;
            
            //intitialise left and right pointers
            left = i+1;
            right = nums.length - 1;
            
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                
                if(sum < 0){
                    //increment left as numbers on left are smaller
                    left++;
                }
                else if(sum > 0){
                    //decrement right as number on  right are greater
                    right--;
                }
                else{
                    //found the correct three numbers                     
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //skip repeat numbers
                    while(left < right && nums[left] == nums[left+1])
                        left++;
                    while(left < right && nums[right] == nums[right-1])
                        right--;
                    
                    left++;
                    right--;
                }
            }                     
        }
        return result;
    }
}