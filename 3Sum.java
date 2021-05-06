// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(n2) since we have nested loops and nO(logn) for sorting the array initially
//Space Complexity: O(1) since we are not taking any extra space except the resultList

public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> resultList = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            
            //skip duplicate values
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1; 
            int right = nums.length - 1;
            
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum == 0)
                {
                    resultList.add(List.of(nums[i], nums[left], nums[right])); 
                    left++;
                    right--;
                    // continue if we have the same numbers in the consecutive positions
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                } else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return resultList;
    }