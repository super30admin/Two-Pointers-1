package S30.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Time complexity: O(n^2 log n)
//Spaces complexity: O(1)
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
    int size = nums.length;
        if(size == 0 || size < 3) return null;
       Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();

       for (int i =0; i<size-2; i++ ) {
        if(i > 0 && nums[i] == nums[i-1])
            continue;
        int left = i +1;
        int right = size -1;
        while(left < right){
            int sum = nums[i] + nums[left]+ nums[right];
            if(sum == 0){
                result.add(Arrays.asList(nums[i],nums[left], nums[right]));
                left++; right--;
                while(left < right && nums[left]== nums[left-1])
                    left++;
                while(left < right && nums[right]== nums[right +1])
                    right--;

            }else if(sum >0){
                right --;
            }else{
                left++;
            }
        }

    }
        return result;
}
}
