//time complexity :  O(n^2)
//space complexity : O(n)
//leet code execution : successfull
//Steps: 1) sort the given array, followed by intitlaise two pointers low pointing to first element and high pointing to last element.
// now iterate array and sum up elemets at i,low and high pointers if it's zero increment the pointers and verify till both pointers reach mid node.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ThreeSum15 {
 
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
       // {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        // -4,-1,-1,0,1,2
         
        int i, low, high;
        for( i =0; i<nums.length-2;i++){
            if( i>0 && nums[i]==nums[i-1]){
                continue;
            }
            low = i+1; //1
            high = nums.length-1;//4

            while(low<high){
                int sum =nums[i]+nums[low]+nums[high]; // -4-1+1 // -4-10//
                
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }
                else if (sum>0){
                    high--;
                }
                else {
                    low++;
                }
                }
            }
            
        
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
            
    }



}