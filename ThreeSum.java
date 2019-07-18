/**
 * Idea: 
 * 1. Sort the array. 
 * 2. For each element Iterate with remaining array with 2 pointers (low and high) and check if sum of 3 elements is 0.  
 * 3. Skip sum calculation based on sum value. Attend to edge cases to avoid duplicates.
 * 
 * Time Compleity: O(n^2)
 * Space Complexity: O(1) - no extra space otehr than result list
 * Leetcode: Yes
 */

import java.util.*;
class ThreeSum {

     
    public List<List<Integer>> findTriplets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> hset = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            int a = nums[i];
            
            int sum = -a;
            int start = i + 1;
            int end = nums.length-1;
            while(start<end){
                int tempSum = nums[start] + nums[end];
                if(tempSum==sum){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(a); temp.add(nums[start]);temp.add(nums[end]);
                    if(!hset.contains(temp)){
                        result.add(temp);
                        hset.add(temp);
                    }
                    start++;

                }else if(tempSum<sum)
                    start++;
                else
                    end--;
            }
        }
        return result;
    }
    
    
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;

        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){

            int low = i+1;
            int high = nums.length-1;
            
            //base edge case
            if(i > 0 && nums[i] == nums[i-1]){ continue;}
                
                while(low < high){
                
                    int sum = nums[i] + nums[low] + nums[high];
                    //case 1
                    if(sum == 0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);temp.add(nums[low]);temp.add(nums[high]);
                        result.add(temp);
                        low++;high--;
                        //low edge case
                        while(low < high){
                            if(nums[low] == nums[low-1]){
                                low++;
                            }
                            else break;
                        }
    
                        //high edge case
                        while(low < high){
                            if(nums[high] == nums[high+1]){
                                high--;                                
                            }
                            else break;
                        }
                    }
                    //case 2
                    else if(sum < 0){
                        low++;
                    }
                    //case 3
                    else{
                        high--;
                    }
                }
            }
        return result;        
    }
    
    public static void main(String[] args){
        System.out.println("Three Sum");
        ThreeSum obj = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(obj.threeSum(nums));
    }
}