import java.util.*;
//PROBLEM 1
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution1 {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        
        int left = 0; int right = nums.length-1;
        int current = 0;
         while(current <= right){
             if(nums[current] == 0){
                 //if current pointer is 0 then swap with left
                 swap(nums, current, left);
                 
                 //and increment both left and right
                 current++;
                 left++;
             }

             //if current pointer is 1 then just keep incrementing current
             else if(nums[current] == 1){
                 current++;
             }
             else{

                //if current pointer is 2 then swap with right
                  swap(nums, current, right);

                  //decrement the right pointer
                 right--;
             }
         }
        
    }

    //function to swap objects at two different indices in an array
    private void swap(int[] nums, int current, int leftRight){
        int temp = nums[current];
        nums[current] = nums[leftRight] ;
        nums[leftRight] = temp;
    }
}

//PROBLEM 2
// Time Complexity : O(n ^2)
// Space Complexity :O(1)

class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        
        List<List<Integer>> output = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){

            //if duplicates then continue to the next element
            if(i != 0 && nums[i - 1] == nums[i]){
                continue;
            }
            
            //two pointers
            int left = i+1;
            int right = nums.length - 1;
            
            while(left<right){

                //sum
                int sum = nums[i] + nums[left] + nums[right];
                
                //if sum is 0 then that is the answer
                if(sum == 0){
                    output.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //move the pointers
                    left++;
                    right--;
                    
                    //checking for duplicates for the left & right pointer
                    while(left<right && nums[left - 1] == nums[left]){
                        left++;
                    }
                    while(left < right && nums[right+1] == nums[right]){
                        right--;
                    }
                }

                //if sum is < 0 then move the left pointer because we need to move closer to 0
                else if(sum < 0){
                    left++;

                    //checking for duplicates for the left pointer
                    while(left<right && nums[left - 1] == nums[left]){
                        left++;
                    }
                }

                //if sum is < 0 then move the right pointer because we need to move closer to 0
                else{
                    right--;

                    //checking for duplicates for the right pointer
                    while(left < right && nums[right+1] == nums[right]){
                        right--;
                    }
                }
        }
    }
    return output;
}
}

//PROBLEM 3
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution3 {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
         int max = 0;
        
        //two pointers
        int left = 0;
        int right = height.length - 1;
        
        while(left < right){
        // left cannot be equal to right because there will not be any container
        
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
                                    //width      *   //height
            
            if(height[left] < height[right]){
                left++;
            }
            
            else{
                right--;
            }
        }
        
        return max;
    }
}
