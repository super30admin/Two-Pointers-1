/**
 * Idea: 
 * 1. Sort the array. 
 * 2. Iterate with two loops and check if sum of 2 elements = - third element.
 * 3. If found check if the result doesn't contain the same list of int and insert.
 * 
 * Time Compleity: O(n^2)
 * Space Complexity: O(1) - no extra space otehr than result list
 * Leetcode: No - TLE
 */

import java.util.*;
class ThreeSum {

     
    public List<List<Integer>> findTriplets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
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
                    if(!result.contains(temp))
                        result.add(temp);
                    start++;

                }else if(tempSum<sum)
                    start++;
                else
                    end--;
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Three Sum");
        ThreeSum obj = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(obj.findTriplets(nums));
    }
}