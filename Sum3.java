import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Two pointer approach.
//TC will be O(n^2), as traversing twice.
//SC will be O(1), as just using only on array to store result.

class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length==0){     //Base Cond to check the if given array is empty.
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>(); //list store result.
        int n = nums.length;                //length

        Arrays.sort(nums);          //to sort

        for(int i =0; i<n ; i++){
            if(i != 0 && nums[i] == nums[i-1]){     //Condn to check if the previous number is same
                continue;
            }

            if(nums[i]>0){
                break;
            }

            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];   //to get the sum
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));  //add it to result array
                    left++;  //move left pointer
                    right--;  //move right pointer
                    while(left<right && (nums[left]==nums[left-1])){
                        left++;  //keep moving left pointer till next number is different
                    }
                    while(left<right && (nums[right]==nums[right+1])){
                        right--;            //keep moving right pointer till prev number is different
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Sum3 obj = new Sum3();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(obj.threeSum(nums));
    }
}